package org.cts.green;

public class Hello {
public static void main(String[] args) {
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	try {
		String s=new String("ktk");
		System.out.println(s);
	}
	catch(ArithmeticException e){
		System.out.println("dot allow");
	}
	finally {
		System.out.println("final");
	}
}
}
