package com.java.OOPS.Polymorphism;

class Example
{
	String s="SuperKeyWord";                            
	void display()
	{
		int i=60;
		System.out.println("Example class Method display");
        System.out.println(i);
	}	
	Example()                               
	{
		System.out.println("Example class Constructor");
	}
}
class SuperExample extends Example
{
	void run()
	{
		System.out.println("SupeExample class Method run");
		System.out.println(super.s);       
	}
	void display()
	{
		int i=50;
		System.out.println("SuperExample class Method display");
        System.out.println(i);
        super.display();                   
	}
	SuperExample()
	{
		super();                         
		System.out.println("SuperExample class Constructor");
	}
}
public class SuperKeyword 
{
   public static void main(String[] args) 
   {
     SuperExample se=new SuperExample();
     se.run();
     se.display();  
   }
}
