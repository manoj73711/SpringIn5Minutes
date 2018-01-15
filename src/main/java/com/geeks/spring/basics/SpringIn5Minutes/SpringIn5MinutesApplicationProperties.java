package com.geeks.spring.basics.SpringIn5Minutes;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.geeks.spring.basics.SpringIn5Minutes.basic.SortingAlgorithmImpl;
import com.geeks.spring.basics.SpringIn5Minutes.propertyFile.PropertyLoader;

import ch.qos.logback.core.Context;

/*//This annotation is for spring boot
@SpringBootApplication
*/
//This is for the spring application without boot
@Configuration
@ComponentScan
//@PropertySource("classpath:url.properties")
public class SpringIn5MinutesApplicationProperties {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringIn5MinutesApplicationProperties.class);
		PropertyLoader propertyLoader=context.getBean(PropertyLoader.class);
		System.out.println(propertyLoader.getHomeURL());
		
	}
}

