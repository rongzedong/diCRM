package com.di.crm.common.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@MapperScan("com.di.crm.common.mapper")
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.di.hr"}, 
			useDefaultFilters = false, 
			includeFilters = {@Filter(Service.class),
							  @Filter(Component.class),
							  @Filter(Controller.class)})
@Configuration
public class HrConfig implements TransactionManagementConfigurer {
	
	 @Autowired
	 private Environment env;
	 
	 //@Value("${db.driver}")
	 private String driver;
	 
	 //@Value("${db.url}")
	 private String url;
	 
	 //@Value("${db.user}")
	 private String user;
	 
	 //@Value("${db.password}")
	 private String password;

	 /*@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.setName("testdb")
				.setType(EmbeddedDatabaseType.HSQL)	//DB종류 설정
				.addScript("schema_hsql.sql")
				.addScript("data.sql")
				.build();
	}*/
	
	
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource  dataSource = new ComboPooledDataSource();
        
        if (driver != null) {
        	dataSource.setDriverClass(driver);
            dataSource.setJdbcUrl(url);
            dataSource.setUser(user);
            dataSource.setPassword(password);	
        } else {
        	dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/study");
            dataSource.setUser("study");
            dataSource.setPassword("study");
        }
        
        dataSource.setPreferredTestQuery("select 1");
        dataSource.setMinPoolSize(3);
        dataSource.setMaxPoolSize(20);
        dataSource.setIdleConnectionTestPeriod(300);
        dataSource.setMaxIdleTimeExcessConnections(240);
        dataSource.setAcquireIncrement(1);

        return dataSource;
    }
	 
	@Bean
	public PlatformTransactionManager transactionManager() throws PropertyVetoException {
		return new DataSourceTransactionManager(dataSource());
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		return sessionFactory.getObject();
	}

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		try {
			return transactionManager();
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // reference the existing @Bean method above
		return null;
	}
}
