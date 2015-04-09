package ru.atc.pgu.proccenter.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws22.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import ru.atc.pgu.proccenter.stub.processingcenter.ProcessingCenter;

import javax.xml.ws.Endpoint;


@Configuration
@ImportResource({"classpath:META-INF/cxf/cxf.xml", "classpath:META-INF/cxf/cxf-servlet.xml"})
public class CXFConfig {

    @Autowired
    Bus cxfBus;

    @Autowired
    RequestInterceptor requestInterceptor;

    @Autowired
    ResponseInterceptor responseInterceptor;

    @Autowired
    ProcessingCenter processingCenter;


    @Autowired
    Environment env;

    @Bean
    public ServletRegistrationBean servletRegistrationBeanCFX(){
        CXFServlet test = new CXFServlet();
        ServletRegistrationBean cfx = new ServletRegistrationBean(test,"/services/*");
        cfx.setLoadOnStartup(2);
        return cfx;
    }

    @Bean
    public Endpoint calculator() {

        EndpointImpl endpoint = new EndpointImpl(cxfBus, processingCenter);
        endpoint.setAddress("/procService");
        endpoint.getInInterceptors().add(requestInterceptor);
        /*String[] profiles = env.getActiveProfiles();
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].equals("production")) {*/
                endpoint.getOutInterceptors().add(responseInterceptor);
           /* }
        }*/
        endpoint.publish();
        return endpoint;
    }

}
