package org.apache;

import com.example.AbsClass;
import org.apache.BoomClass;

public class InheritanceClass extends AbsClass 
{
	public InheritanceClass() throws Exception
	{
		super();
	}
	public void first() throws Exception
	{
		System.out.println("first");
		try 
		{
			System.out.println("org.apache 5 - call to the boom function");
			BoomClass bm = new BoomClass();
			bm.boomfunction();
		} 
		catch (Exception e) 
		{
			System.out.println("org.apache 7 - get the exception and rethrow it");
			throw new Exception(e);
		}

	}

	public void second() throws Exception
	{
		System.out.println("org.apache 5 - the boom of second function");
		throw new Exception();
	}
}
