package com.geeks.spring.basics.SpringIn5Minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geeks.spring.basics.SpringIn5Minutes.cdi.SortingAlgorithmImplCDI;

@SpringBootApplication
public class SpringIn5MinutesApplicationCDI {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringIn5MinutesApplicationCDI.class, args);
		SortingAlgorithmImplCDI impl=context.getBean(SortingAlgorithmImplCDI.class);
		SortingAlgorithmImplCDI impl1=context.getBean(SortingAlgorithmImplCDI.class);
		System.out.println(impl);
		System.out.println(impl1);
		System.out.println("Hey here is the output: "+impl.findElementInArray(new int[] {2,3,4},5));
	
	}
}
