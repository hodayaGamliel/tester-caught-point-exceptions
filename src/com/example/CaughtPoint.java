package com.example;

import org.apache.CaughtPoint2;

public class CaughtPoint 
{
	public static void main(String[] args) throws Exception
	{
		callCaughtPoint2();
	}
	
	public static void callCaughtPoint2() throws Exception
	{
		try
		{
			System.out.println("call to caught point");
			CaughtPoint2 cp = new CaughtPoint2();
			cp.caughtPoint2();
		}
		catch (Exception ex)
		{	
			ex.printStackTrace();
		}
	}
	
	public void throwNewException() throws Exception
	{
		System.out.println("throw exception");
		throw new Exception();
	}
}
