package org.apache;

import org.apache.InheritanceClass;

import com.example.AbsClass;


public class CaughtPoint2Complex 
{
	public static void main(String[] args) 
	{
		
	}
	public void caughtPoint2() throws Exception 
	{
	try 
		{
			System.out.println("org.apache 3 - try of caughtPoint2 - create new object from inhertence class into com.example");
			System.out.println("");
			AbsClass in = new InheritanceClass();
		//	in.second();
		} 
		catch (Exception e)
		{
		System.out.println("org.apache 9 - catch of caughtPoint2 - get the exception - and rethrow it");
		throw new Exception(e);
		}
	}
}
