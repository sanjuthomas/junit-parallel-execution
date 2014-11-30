package com.ourownjava.junit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
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
	
	@Before
	public void setUp(){
		unitUnderTest2 = new UnitUnderTest2();
	}

	@Test
	public void shouldReturnMethod1() throws InterruptedException{
		System.out.println("TestUnitUnderTest2.shouldReturnMethod1()" + new Date());
		assertEquals("method1", unitUnderTest2.method1());
	}
	
	@Test
	public void shouldReturnMethod2() throws InterruptedException{
		System.out.println("TestUnitUnderTest2.shouldReturnMethod2()" + new Date());
		assertEquals("method2", unitUnderTest2.method2());
	}
	
	@Test
	public void shouldReturnMethod3() throws InterruptedException{
		System.out.println("TestUnitUnderTest2.shouldReturnMethod3()" + new Date());
		assertEquals("method3", unitUnderTest2.method3());
	}
}
