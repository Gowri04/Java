package com.java.Encapsulation.AccessModifiers;

class AccessModifiersClass
{
	public void method()
	{
		System.out.println("Public Access Modifier- Anywhere inside the project");
	}
	
	protected void method2()
	{
		System.out.println("Protected Access Modifier- Only particular package we can access via inheritance");
	}
}
public class AccessModifier 
{
	private void method1()
	{
		System.out.println("Private Access Modifier- Within particular class");
	}
	public static void main(String[] args)
	{
		AccessModifiersClass amc=new AccessModifiersClass();
		
		amc.method();
		
		amc.method2();	
		
		AccessModifier am=new AccessModifier();
		
		am.method1();
	}
}

