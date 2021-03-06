package com.geeks.spring.basics.SpringIn5Minutes.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm{

	@Override
	public int findElementInArray(int[] a, int b) {
		// This is some BibbleSortAlogrithm Magic Happening
		System.out.println("BubbleSort Algorithm is invoked to process");
		return 3;
	}
	
	@PostConstruct
	public void postConstructBubble() {
		System.out.println("postConstruct()");
	}
@PreDestroy
public void preDestroyBubble() {
	System.out.println("preDestroy()");
}
}
