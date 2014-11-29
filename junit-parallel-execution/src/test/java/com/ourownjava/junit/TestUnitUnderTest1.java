package com.ourownjava.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestUnitUnderTest1 {
	
	private UnitUnderTest1 unitUnderTest1;
	
	@Before
	public void setUp(){
		unitUnderTest1 = new UnitUnderTest1();
	}
	
	@Test
	public void shouldReturnMethod1() throws InterruptedException{
		assertEquals("method1", unitUnderTest1.method1());
	}
	
	@Test
	public void shouldReturnMethod2() throws InterruptedException{
		assertEquals("method2", unitUnderTest1.method2());
	}
	
	@Test
	public void shouldReturnMethod3() throws InterruptedException{
		assertEquals("method3", unitUnderTest1.method3());
	}
}
