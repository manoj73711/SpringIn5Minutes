package com.geeks.spring.basics.SpringIn5Minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SortingAlgorithmImpl {
	
@Autowired	
SortingAlgorithm sortingAlgorithm;	
public int findElementInArray(int[ ] b ,int a) {
		
	return sortingAlgorithm.findElementInArray(b, a);
}
}
