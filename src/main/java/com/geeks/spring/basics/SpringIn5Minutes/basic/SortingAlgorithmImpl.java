package com.geeks.spring.basics.SpringIn5Minutes.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SortingAlgorithmImpl {
	
@Autowired	
@Qualifier("quick")
SortingAlgorithm sortAlgorithm;	
public int findElementInArray(int[ ] b ,int a) {
	
	System.out.println(sortAlgorithm);	
	return sortAlgorithm.findElementInArray(b, a);
}
}
