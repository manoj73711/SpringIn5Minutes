package com.geeks.spring.basics.SpringIn5Minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5MinutesApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringIn5MinutesApplication.class, args);
		SortingAlgorithmImpl impl=context.getBean(SortingAlgorithmImpl.class);
		SortingAlgorithmImpl impl1=context.getBean(SortingAlgorithmImpl.class);
		System.out.println(impl);
		System.out.println(impl1);
		System.out.println("Hey here is the output: "+impl.findElementInArray(new int[] {2,3,4},5));
	
	}
}
