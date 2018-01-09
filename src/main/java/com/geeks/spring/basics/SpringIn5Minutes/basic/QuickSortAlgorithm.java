package com.geeks.spring.basics.SpringIn5Minutes.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortingAlgorithm{

	@Override
	public int findElementInArray(int[] a, int b) {
		// There is some QuickSort Algorithm processing happening here
		System.out.println("QuickSort Algorithm is invoked to process");
		return 3;
	}

}
