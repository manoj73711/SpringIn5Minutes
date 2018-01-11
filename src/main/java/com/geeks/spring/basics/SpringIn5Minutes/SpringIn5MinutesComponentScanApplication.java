package com.geeks.spring.basics.SpringIn5Minutes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.geeks.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.geeks.spring.basics.componentscan")
public class SpringIn5MinutesComponentScanApplication {
	public static Logger LOGGER = LoggerFactory.getLogger(SpringIn5MinutesComponentScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringIn5MinutesComponentScanApplication.class, args);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
		
	}
}
