package com.cgy.mvc.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.cj.jdbc.MysqlXADataSource;


@Configuration
public class DateSourceBean {
	
	@Bean(value="cgy")
	@ConfigurationProperties(prefix="com.emotte.cgy")
	public DataSource getDataSource1() {
		//return DataSourceBuilder.create().build();
		
		MysqlXADataSource dataSource = new MysqlXADataSource(); 
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/cgy?Unicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
		
		AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
		ds.setUniqueResourceName("mysql_cgy");
		ds.setXaDataSource(dataSource);
		
		return ds;
		
	}
	
	@Bean(value="cgy1")
	@ConfigurationProperties(prefix="com.emotte.cgy1")
	public DataSource getDataSource2() {
		//return DataSourceBuilder.create().build();

		MysqlXADataSource dataSource = new MysqlXADataSource(); 
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/cgy1?Unicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
		
		AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
		ds.setUniqueResourceName("mysql_cgy1");
		ds.setXaDataSource(dataSource);
		
		return ds;
	}
	
}
