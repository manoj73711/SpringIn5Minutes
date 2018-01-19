package com.geeks.spring.mockito.cdi.SomeCdiDao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiDaoTest {
	@InjectMocks
	SomeCdiBusiness someCdiBusiness;
	@Mock
	SomeCdiDao dao;

	@Test
	public void testfindGreatestTest() {
		Mockito.when(dao.getData()).thenReturn(new int[] {2,3,5});
		assertEquals(5,someCdiBusiness.findGreatest());
	}
	@Test
	public void testfindGreatestTest1() {
		Mockito.when(dao.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,someCdiBusiness.findGreatest());
	}

}
