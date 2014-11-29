package com.ourownjava.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mockit.Tested;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class TestUnitUnderTest2 {
	
	@Tested
	private UnitUnderTest2 unitUnderTest2;

	@Test
	public void shouldReturnMethod1() throws InterruptedException{
		assertEquals("method1", unitUnderTest2.method1());
	}
	
	@Test
	public void shouldReturnMethod2() throws InterruptedException{
		assertEquals("method2", unitUnderTest2.method2());
	}
	
	@Test
	public void shouldReturnMethod3() throws InterruptedException{
		assertEquals("method3", unitUnderTest2.method3());
	}
}
