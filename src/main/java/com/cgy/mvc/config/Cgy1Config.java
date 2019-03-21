package com.cgy.mvc.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages= {"com.cgy.mvc.mapper.cgy1"},sqlSessionFactoryRef="cgy1SqlSessionFactory")
@Configuration
public class Cgy1Config {
	
	@Bean("cgy1SqlSessionFactory")
	public SqlSessionFactory getSqlSessionFactory(@Qualifier("cgy1") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean.getObject();
	}
	
//	@Bean("cgy1TransactionManager")
//	public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier("cgy1") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
	
	@Bean("cgy1Template")
	public SqlSessionTemplate getTemp(@Qualifier("cgy1SqlSessionFactory") SqlSessionFactory factory) {
		return new SqlSessionTemplate(factory);
	}
	
}
