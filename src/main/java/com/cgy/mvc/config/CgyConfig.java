package com.cgy.mvc.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages= {"com.cgy.mvc.mapper.cgy"},sqlSessionFactoryRef="cgySqlSessionFactory")
@Configuration
public class CgyConfig {
	
	@Bean(name="cgySqlSessionFactory")
	public SqlSessionFactory getSqlSessionFactory(@Qualifier("cgy") DataSource dataSource) throws Exception {
		 SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		 factory.setDataSource(dataSource);
		 return factory.getObject();
	}
	
//	@Bean(name="cgyTransaction")
//	public DataSourceTransactionManager getTransaction(@Qualifier("cgy") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
	
	@Bean(value="cgySqlSessionTemplate")
	public  SqlSessionTemplate getSqlSessionTemplate(@Qualifier("cgySqlSessionFactory") SqlSessionFactory factory) {
		return new SqlSessionTemplate(factory);
	}
	
}
