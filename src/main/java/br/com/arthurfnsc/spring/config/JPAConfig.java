package br.com.arthurfnsc.spring.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("br.com.arthurfnsc")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("br.com.arthurfnsc.repositories")
public class JPAConfig {

    private static final String DATABASE_DRIVER = "db.driver";
    private static final String DATABASE_PASSWORD = "db.password";
    private static final String DATABASE_URL = "db.url";
    private static final String DATABASE_USERNAME = "db.username";
    private static final String ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
    private static final String HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String HIBERNATE_EJB_NAMING_STRATEGY = "hibernate.ejb.naming_strategy";
    private static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
    private static final String HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
    private static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource() {

        final DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(this.env.getRequiredProperty(DATABASE_DRIVER));
        dataSource.setUrl(this.env.getRequiredProperty(DATABASE_URL));
        dataSource.setUsername(this.env.getRequiredProperty(DATABASE_USERNAME));
        dataSource.setPassword(this.env.getRequiredProperty(DATABASE_PASSWORD));

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(this.dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        entityManagerFactoryBean.setPackagesToScan(this.env.getRequiredProperty(ENTITYMANAGER_PACKAGES_TO_SCAN));
        entityManagerFactoryBean.setJpaProperties(this.jpaProperties());

        return entityManagerFactoryBean;
    }

    private Properties jpaProperties() {

        final Properties properties = new Properties();
        properties.put(HIBERNATE_DIALECT, this.env.getRequiredProperty(HIBERNATE_DIALECT));
        properties.put(HIBERNATE_EJB_NAMING_STRATEGY, this.env.getRequiredProperty(HIBERNATE_EJB_NAMING_STRATEGY));
        properties.put(HIBERNATE_FORMAT_SQL, this.env.getRequiredProperty(HIBERNATE_FORMAT_SQL));
        properties.put(HIBERNATE_HBM2DDL_AUTO, this.env.getRequiredProperty(HIBERNATE_HBM2DDL_AUTO));
        properties.put(HIBERNATE_SHOW_SQL, this.env.getRequiredProperty(HIBERNATE_SHOW_SQL));

        return properties;
    }

    @Bean
    public JpaTransactionManager transactionManager() {

        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(this.entityManagerFactory().getObject());

        return transactionManager;
    }
}
