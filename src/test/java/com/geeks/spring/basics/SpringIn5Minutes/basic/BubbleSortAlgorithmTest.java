package com.geeks.spring.basics.SpringIn5Minutes.basic;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.geeks.spring.basics.SpringIn5Minutes.SpringIn5MinutesApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5MinutesApplication.class)
public class BubbleSortAlgorithmTest {
	@Autowired
	BubbleSortAlgorithm bubbleSortAlgorithm;

	@Test
	public void scenario1() {
		assertEquals(3,bubbleSortAlgorithm.findElementInArray(new int[] {}, 4));
		assertNotEquals(2,bubbleSortAlgorithm.findElementInArray(new int[] {}, 4));
	}

}
