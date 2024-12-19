package day4;

import java.util.Scanner;

public class Condition {

	public static void main(String [] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1 for add");
		System.out.println("2 for sub");
		/*
		 * System.out.println("Enter the student mark"); int Student = sc.nextInt();
		 * if((Student >= 35 )&&(Student <= 100)) {
		 * 
		 * if( Student >= 90) { System.out.println("Grade A"); }
		 * 
		 * 
		 * else if (Student >= 80 ) { System.out.println("Grade B");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * else if (Student >= 35 ) {
		 * 
		 * System.out.println("Grade C");
		 * 
		 * }
		 * 
		 * } else if(Student >= 100 ) { System.out.println("invalid mark"); } else{
		 * System.out.println("fail"); }
		 */
		
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("enter the frstnumber");
				int fnum = sc.nextInt();
				System.out.println("enter the  secondnumber");
				int snum = sc.nextInt();
				System.out.println("add" + (fnum+snum));
				break ;
			}
			case 2 : {
				System.out.println("enter the frstnumber");
				int fnum = sc.nextInt();
				System.out.println("enter the  secondnumber");
				int snum = sc.nextInt();
				System.out.println("sub" + (fnum-snum));
				break;
			}
			
			case 3 : {
				System.out.println("enter the frstnumber");
				int fnum = sc.nextInt();
				System.out.println("enter the  secondnumber");
				int snum = sc.nextInt();
				System.out.println("mul" + (fnum*snum));
				break;
			}
			case 4 : {
				System.out.println("enter the frstnumber");
				int fnum = sc.nextInt();
				System.out.println("enter the  secondnumber");
				int snum = sc.nextInt();
				System.out.println("div" + (fnum/snum));
				break;
			
		}
			case 5 : {
				System.out.println("enter the frstnumber");
				int fnum = sc.nextInt();
				System.out.println("enter the  secondnumber");
				int snum = sc.nextInt();
				System.out.println("mod" + (fnum%snum));
				break;
			
		}
	}
}
}
	

