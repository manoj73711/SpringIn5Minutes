package com.geeks.spring.basics.SpringIn5Minutes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geeks.spring.basics.SpringIn5Minutes.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5MinutesScopeApplication {
	public static Logger LOGGER = LoggerFactory.getLogger(SpringIn5MinutesScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIn5MinutesScopeApplication.class, args);
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO2=context.getBean(PersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	
	}
}
