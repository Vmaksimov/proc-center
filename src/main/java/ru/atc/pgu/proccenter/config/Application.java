package ru.atc.pgu.proccenter.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "ru.atc.pgu.proccenter")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"ru.atc.pgu.proccenter.DAO"})
@EntityScan(basePackages = "ru.atc.pgu.proccenter.domain")
@PropertySource(value = "file://${catalina.home}/conf/procCenter.properties", ignoreResourceNotFound = true)
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
        handlerAdapter.getMessageConverters().add(0, new ByteArrayHttpMessageConverter());
        handlerAdapter.getMessageConverters().add(1, new Jaxb2RootElementHttpMessageConverter());
        handlerAdapter.getMessageConverters().add(2, new StringHttpMessageConverter());
        handlerAdapter.getMessageConverters().add(3, new ResourceHttpMessageConverter());
        handlerAdapter.getMessageConverters().add(4, new SourceHttpMessageConverter());
        handlerAdapter.getMessageConverters().add(5, getMappingJackson2HttpMessageConverter());
        return handlerAdapter;
    }

    @Bean(name = "jsonConverter")
    public MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        List<MediaType> mediaTypeList = new ArrayList<MediaType>();
        mediaTypeList.add(MediaType.APPLICATION_JSON);
        mediaTypeList.add(MediaType.APPLICATION_OCTET_STREAM);
        mediaTypeList.add(MediaType.APPLICATION_FORM_URLENCODED);
        mediaTypeList.add(MediaType.MULTIPART_FORM_DATA);
        mediaTypeList.add(MediaType.TEXT_HTML);
        converter.setSupportedMediaTypes(mediaTypeList);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        converter.setObjectMapper(objectMapper);
        return converter;
    }

/*    @Bean
    public CharacterEncodingFilter characterEncodingFilter(final ServletContext servletContext) {
        final CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        FilterRegistration.Dynamic filter = servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);
        filter.addMappingForUrlPatterns(null, false, "");
        return characterEncodingFilter;
    }*/

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory(8080);
        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {

            @Override
            public void customize(Connector connector) {
                connector.setURIEncoding("UTF-8");
                connector.setMaxPostSize(4388608);
                connector.setUseBodyEncodingForURI(true);

            }
        });
        return factory;
    }
} 