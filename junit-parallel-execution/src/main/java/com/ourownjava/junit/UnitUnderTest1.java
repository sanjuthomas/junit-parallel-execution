package com.ourownjava.junit;

/**
 * 
 * @author Sanju Thomas	
 *
 */

public class UnitUnderTest1{
	
	public String method1() throws InterruptedException{
		Thread.sleep(2000);
		return "method1";
	}
	
	public String method2() throws InterruptedException{
		Thread.sleep(2000);
		return "method2";
	}
	
	public String method3() throws InterruptedException{
		Thread.sleep(2000);
		return "method3";
	}
}