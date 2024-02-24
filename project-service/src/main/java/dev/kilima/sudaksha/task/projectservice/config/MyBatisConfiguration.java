package dev.kilima.sudaksha.task.projectservice.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MyBatisConfiguration {
	
	// Database definition
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sudaksha_task");
		ds.setUsername("john");
		ds.setPassword("john1234");
		return ds;
	}
	
	//Define mysql database configuration setup
		@Bean
		public SqlSessionFactory sessionFactory() throws Exception {
			SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
			factoryBean.setDataSource(dataSource());
			return factoryBean.getObject();
		}

}
