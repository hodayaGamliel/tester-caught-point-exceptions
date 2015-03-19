package com.example;


public abstract class AbsClass 
{
	public AbsClass() throws Exception
	{
		try 
		{
			System.out.println("com.example 4 - try of AbsClass - execute  the second function for the object of InheritanceClass");
			first();
		}
		catch (Exception e) 
		{
			System.out.println("com.example 8 catch of AbsClass - get the exception - and rethrow it");
			throw new Exception(e);
		}
	}

	public abstract void first() throws Exception;
	public abstract void second() throws Exception; 
}
