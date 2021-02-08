package com.java.ExceptionHandling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*

Exception 

1. Dictionary Meaning Exception is an abnormal condition.
2. In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

Exception Handling
1. Exception Handling is a mechanism to handle runtime errors so that normal flow of the application can be maintained.
2. Exception such as ClassNotFoundException, IOException, SQLException, RemoteException.

Advantage of Exception Handling
The core advantage of exception handling is�to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application that is why we use exception handling.


Types of Java Exceptions

1. Checked
2. Unchecked

1) Checked Exception
The classes which directly inherit Throwable class are known as checked exceptions e.g. IOException, SQLException etc. 
Checked exceptions are checked at compile-time.
2) Unchecked Exception
1. The classes which inherit RuntimeException are known as unchecked exceptions.
2. RuntimeException are
	a. ArithmeticException
	b. NullPointerException
	c. ArrayIndexOutOfBoundsException.
3. Unchecked exceptions are checked at runtime.
Note: According to Oracle, Error is an Unchecked Exception. Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

Java Exception Keywords
5 keywords are used in handling exceptions in Java.
try
1. "try" keyword is used to specify a block where we should place exception code. 
2. The try block must be followed by either catch or finally.
3. It means, we can't use try block alone.
catch
1. "catch" block is used to handle the exception. 
2. It must be preceded by "try" block which means we can't use catch block alone. 
3. It can be followed by finally block later.
finally	
1. "finally" block is used to execute the important code of the program. 
2. It is executed whether an exception is handled or not.
throw	
1. "throw" keyword is used to throw an exception.
Throws
1. "throws" keyword is used to declare exceptions
2. It doesn't throw an exception.
3. It specifies that there may occur an exception in the method. 
4. It is always used with method signature/declaration.

Common Scenarios(unchecked exceptions) of Java Exceptions
1) A scenario where ArithmeticException occurs?
If we divide any number by zero, there occurs an ArithmeticException.
int�a=50/0;//ArithmeticException��

2) A scenario where NullPointerException occurs?
If we have a null value in any�variable, performing any operation on the variable throws a NullPointerException.
String�s=null;� System.out.println(s.length());//NullPointerException��

3) A scenario where NumberFormatException occurs?
The wrong formatting of any value may occur NumberFormatException. Suppose I have a�string�variable that has characters, converting this variable into digit will occur NumberFormatException.
String�s="abc";��
int�i=Integer.parseInt(s);//NumberFormatException��

4) A scenario where ArrayIndexOutOfBoundsException occurs?
If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException as shown below:
int�a[]=new�int[5];��
a[10]=50;�//ArrayIndexOutOfBoundsException��

Can we able to create our own exception?
Yes, By using throw and throws keyword we able to create our own exception.


*/