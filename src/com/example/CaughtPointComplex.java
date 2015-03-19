package com.example;

import org.apache.CaughtPoint2Complex;

public class CaughtPointComplex 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("com.example 1 - main of callCaughtPoint");
		callCaughtPoint2();
	}
	
	public static void callCaughtPoint2() throws Exception
	{
		try
		{
			System.out.println("com.example 2 - try of caughtPoint - call to caught point 2");
			CaughtPoint2Complex cp = new CaughtPoint2Complex();
			cp.caughtPoint2();
		}
		catch (Exception ex)
		{	
			System.out.println("com.example 10 - catch of caughtPoint - the print stack of the exception");
			ex.printStackTrace();
		}
	}
}
