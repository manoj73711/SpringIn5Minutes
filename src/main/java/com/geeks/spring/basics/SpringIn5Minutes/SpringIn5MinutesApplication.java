package com.geeks.spring.basics.SpringIn5Minutes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.geeks.spring.basics.SpringIn5Minutes.basic.SortingAlgorithmImpl;

/*//This annotation is for spring boot
@SpringBootApplication
*/
//This is for the spring application without boot
@Configuration
@ComponentScan
public class SpringIn5MinutesApplication {

	public static void main(String[] args) {
		//ApplicationContext context=SpringApplication.run(SpringIn5MinutesApplication.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringIn5MinutesApplication.class);
		SortingAlgorithmImpl impl=context.getBean(SortingAlgorithmImpl.class);
		SortingAlgorithmImpl impl1=context.getBean(SortingAlgorithmImpl.class);
		System.out.println(impl);
		System.out.println(impl1);
		System.out.println("Hey here is the output: "+impl.findElementInArray(new int[] {2,3,4},5));
	
	}
}
