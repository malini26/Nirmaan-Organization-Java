package day8;

import java.util.Scanner;

public class userinterface {
 public static void main(String[] args) {
	 calculator bixcey = new calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the frst number");
	int a =sc.nextInt();
	System.out.println("enter the second number");
	int b =sc.nextInt();
	System.out.println("addition :" + bixcey.add(a, b) );
	
	
	
	System.out.println("subtraction :" + bixcey.sub(a, b));
	
	
	System.out.println("multiply :" + bixcey.mul(a, b) );
	
	
	System.out.println("division :" + bixcey.div(a, b) );
	
	
	

	System.out.println("modula :" + bixcey.mod(a, b) );
	
}
}
