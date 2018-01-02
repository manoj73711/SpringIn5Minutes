package com.geeks.spring.basics.SpringIn5Minutes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class QuickSortAlgorithm implements SortingAlgorithm{

	@Override
	public int findElementInArray(int[] a, int b) {
		// There is some QuickSort Algorithm processing happening here
		System.out.println("QuickSort Algorithm is invoked to process");
		return 3;
	}

}
