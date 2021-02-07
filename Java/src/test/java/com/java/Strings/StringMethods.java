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
/*

Length() is used to returns the length of the string.
concat() is used to combine two strings together.
Trim() is used to remove whitespaces in starting and ending position of the string.
charAt() is used to return the character value of the given index number.Index Number starts with 0.
contains() is used search for the sequence of characters in the string. Returns TRUE if sequence of char value are found in the string otherwise returns FALSE.
equals() is used to compare two given strings based on the content of the string. If the character is not matched, it returns FALSE. If all the characters are matched it returns TRUE.
equalsIgnoreCase() is used to compare two strings on the basis of content but it does not check the case like equals() method, In this method, if the character match, it returns true else false.
replace() is used to replace the old character or char sequence to new characters.
substring() is used to return the string based on starting index and ending index.
toLowerCase() is used to return the string in lowercase letter.
toUpperCase() is used to return the string in uppercase letter. 

*/

