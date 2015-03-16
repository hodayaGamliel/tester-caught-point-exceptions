package org.apache;

import com.example.CaughtPoint;

public class CaughtPoint2 
{
	public static void main(String[] args) 
	{
		
	}
	public void caughtPoint2() throws Exception 
	{
	try 
		{
			System.out.println("call to throw exception from CaughtPoint");
			CaughtPoint cp = new CaughtPoint();
			cp.throwNewException();
		} 
		catch (Exception e)
		{
		System.out.println("rethrow the exception to com.example");
		throw new Exception(e);
		}
	}
}
