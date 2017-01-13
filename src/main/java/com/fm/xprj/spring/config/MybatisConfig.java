package com.fm.xprj.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.fm.xprj.dao")
public class MybatisConfig {
	@Value("${db.driver}")    String driverClass;
    @Value("${db.url}")       String url;
    @Value("${db.username}")  String userName;
    @Value("${db.password}")  String passWord;
    @Value("${db.validationQuery}")  String validationQuery;
    
    
    @Value("${db.initialPoolSize}")   int initialPoolSize;
    @Value("${db.maxActive}")       int maxActive;
    @Value("${db.maxIdle}")       int maxIdle;
    @Value("${db.minIdle}")       int minIdle;
    @Value("${db.maxWait}")  int maxWait;
    
    @Bean
    public DataSource dataSource() {
    	BasicDataSource ds=new BasicDataSource();
    	ds.setDriverClassName(driverClass);
    	ds.setUrl(url);
    	ds.setUsername(userName);
    	ds.setPassword(passWord);
    	ds.setInitialSize(initialPoolSize);
    	ds.setMaxActive(maxActive);
    	ds.setMaxIdle(maxIdle);
    	ds.setMinIdle(minIdle);
    	ds.setMaxWait(maxWait);
    	ds.setValidationQuery(validationQuery);
    	return ds;
    	
    }
    
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        //sessionFactory.setTypeAliasesPackage("com.frank.mvc.bootstrap.model.entity");
        return sessionFactory;
    }

}
