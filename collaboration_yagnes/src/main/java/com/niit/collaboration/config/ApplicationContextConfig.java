package com.niit.collaboration.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.collaboration.dao.FriendDAO;
import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.daoImpl.FriendDAOImpl;
import com.niit.collaboration.daoImpl.UserDAOImpl;
import com.niit.collaboration.model.Friend;
import com.niit.collaboration.model.User;
@Configuration
@ComponentScan(basePackages ={"com.niit"})
@EnableTransactionManagement
public class ApplicationContextConfig {

	/*
	 * 
	 * Select H2 Generic Server in H2 data base than you'll get the your Driver
	 * class will available in H2 console
	 * 
	 * 
	 */
	private final static String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final static String JDBC_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	private final static String JDBC_USERNAME = "BLOG1";
	private final static String JDBC_PASSWORD = "sinu";

	/*
	 * it'll retrun the sessionFactory Object
	 */

	@Bean
	public SessionFactory sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(hibernateProperties());
		builder.scanPackages("com.niit");
		builder.addAnnotatedClass(User.class);
		builder.addAnnotatedClass(Friend.class);
		
		return builder.buildSessionFactory();
	}

	/*
	 * it'll give the DataSource object to SessionFactory
	 */

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(JDBC_DRIVER_CLASS);
		dataSource.setUrl(JDBC_URL);
		dataSource.setUsername(JDBC_USERNAME);
		dataSource.setPassword(JDBC_PASSWORD);
		return dataSource;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.lazy", "false");
		properties.setProperty("hibernate.default_schema", "BLOG1");
		return properties;
	}

	/*
	 * it's responsible to manage all type of transactions
	 */
    @Autowired
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}
    	
    
}