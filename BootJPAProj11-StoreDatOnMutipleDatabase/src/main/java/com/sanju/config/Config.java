package com.sanju.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sanju.repo.prod", entityManagerFactoryRef = "mySqlLCEMFB", transactionManagerRef = "TXmgrForMySQL")
public class Config {
	@Autowired
	private Environment environment;

	@Primary
	@Bean("mysqlDs")
	@ConfigurationProperties(prefix = "mysql.ds")
	public DataSource createMySQLDs() {
		return DataSourceBuilder.create().build();
	}

	@Bean("mySqlLCEMFB")
	public LocalContainerEntityManagerFactoryBean createLCEMFBforMySql(EntityManagerFactoryBuilder builder) {
		Map<String, String> hbProps = new HashMap<>();
		hbProps.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		hbProps.put("hibernate.ddl-auto", "update");
		hbProps.put("hibernate.show_sql", "true");
		hbProps.put("hibernate.format_sql", "true");

		return builder.dataSource(createMySQLDs()).packages("com.sanju.entity.prop").properties(hbProps).build();
	}

	@Bean("TXmgrForMySQL")
	public JpaTransactionManager createTXmgrForMySQL(@Qualifier("mySqlLCEMFB") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}
}
