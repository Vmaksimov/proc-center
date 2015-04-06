
package ru.atc.pgu.proccenter.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.File;
import java.util.Properties;

@org.springframework.context.annotation.Configuration
@EnableJpaRepositories(basePackages = {"ru.atc.pgu.proccenter.DAO", "ru.atc.pgu.proccenter.service"})
@EnableTransactionManagement
public class JpaConfig {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.username}")
    private String username;

    @PostConstruct
    public Server startDBServer() {
        String dbpath = System.getProperty("catalina.home");
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Windows")) {
            dbpath = "proccenter_db/";
        } else {
            if (dbpath == null || dbpath.contains("tmp")) {
                dbpath = "./proccenter_db/";
            } else {
                dbpath = dbpath + "/proccenter_db/";
            }
        }
        System.out.println("DB file ************************** "+dbpath);
        File db = (new File(dbpath));
        db.mkdirs();
        HsqlProperties hsqlProperties = new HsqlProperties();
        hsqlProperties.setProperty("server.database.0", "file:"+ dbpath +"hsqldb");
        hsqlProperties.setProperty("server.dbname.0", "hsqldb");
        hsqlProperties.setProperty("server.port", "9005");
        Server server = new Server();
        try {
            server.setProperties(hsqlProperties);
            server.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return server;
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {

        LocalContainerEntityManagerFactoryBean lcemfb
                = new LocalContainerEntityManagerFactoryBean();

        lcemfb.setDataSource(this.dataSource());
        lcemfb.setPackagesToScan(new String[]{"ru.atc.pgu.proccenter.config.domain"});
        lcemfb.setPersistenceUnitName("MyPU");

        lcemfb.setJpaVendorAdapter(jpaVendorAdapter());

        Properties ps = new Properties();
        ps.put("hibernate.dialect", "ru.atc.pgu.proccenter.config.CustomHSQLDialect");
        ps.put("hibernate.hbm2ddl.auto", "update");
        ps.put("hibernate.show_sql", "false");
        ps.put("hibernate.format_sql", "false");
        lcemfb.setJpaProperties(ps);

        lcemfb.afterPropertiesSet();

        return lcemfb;
    }

    @Bean
    public DataSource dataSource() {

        /*JDBCDataSource jdbcCommonDataSource = new JDBCDataSource();
        try {
            jdbcCommonDataSource.setUrl(url);

            jdbcCommonDataSource.setUser(username);
            jdbcCommonDataSource.setPassword(password);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(false);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabasePlatform("ru.atc.pgu.proccenter.config.CustomHSQLDialect");
        return hibernateJpaVendorAdapter;
    }


}