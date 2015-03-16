package org.apache;

import com.example.AbsClass;

public class InheritanceClass extends AbsClass 
{
	public InheritanceClass() throws Exception
	{
		super();
	}
	public void first() throws Exception
	{
		System.out.println("first");
		throw new Exception();
	}
	public void second() throws Exception
	{
		System.out.println("org.apache 5 - the boom of second function");
		throw new Exception();
	}
}
