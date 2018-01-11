package com.geeks.spring.basics.SpringIn5Minutes.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class BubbleSortAlgorithmCDI implements SortingAlgorithmCDI{

	@Override
	public int findElementInArray(int[] a, int b) {
		// This is some BibbleSortAlogrithm Magic Happening
		System.out.println("BubbleSort Algorithm is invoked to process");
		return 3;
	}
}
