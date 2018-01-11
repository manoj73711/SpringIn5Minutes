package com.geeks.spring.basics.SpringIn5Minutes.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.geeks.spring.basics.SpringIn5Minutes.basic.SortingAlgorithm;
@Named
public class SortingAlgorithmImplCDI {
@Inject
SortingAlgorithmCDI sortAlgorithm;	
public int findElementInArray(int[ ] b ,int a) {
	
	System.out.println(sortAlgorithm);	
	return sortAlgorithm.findElementInArray(b, a);
}
}
