package com.geeks.spring.basics.SpringIn5Minutes;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortingAlgorithm{

	@Override
	public int findElementInArray(int[] a, int b) {
		// This is some BibbleSortAlogrithm Magic Happening
		System.out.println("BubbleSort Algorithm is invoked to process");
		return 3;
	}

}
