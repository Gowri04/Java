package com.java.Strings;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s=" Strings Methods ";
		String s1="In Java";
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		System.out.println(s.trim());
		System.out.println(s.charAt(3));
		System.out.println(s.contains("Met"));
		System.out.println(s.equals("Strings Methods"));
		System.out.println(s.equals(" Strings Methods "));
		System.out.println(s.equalsIgnoreCase(" Strings Methods "));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.replace('S','U'));
		System.out.println(s.replace(" Strings","Methods"));
		System.out.println(s.substring(0,5));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}