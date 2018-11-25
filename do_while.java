package java_programs;
import java.util.*;
public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=5;
		int x;
		int user;
	String dec;
	System.out.println("enter a number 1-100");
	x = in.nextInt();
	System.out.println("\n\n\n\n ");
	
		do{
			
			System.out.println("guess a number 1-100");
			user = in.nextInt();
			
		if(user ==x) {
			System.out.println("correct");
			
		}
		else if(user > x){
			System.out.println("lower");
			if(x % 2 == 0) {
				System.out.println("hint: its even number");
			}
			else {
				System.out.println("hint: it is odd number");
			}	
		}
		else if(user<x) {
			System.out.println("higher");
			if(x % 2 == 0) {
				System.out.println("hint: its even number");
			}
			else {
				System.out.println("hint: it is odd number");
			}
		}
		
		else {
			System.out.println("error");
		}
		
		
		/*System.out.println("continue? yes/no");
		dec = in.next();
		}while(dec.equalsIgnoreCase("yes"));{
			System.out.println("~~thanks for trying your best~~");
		}*/
		}while(user != x);{
			
		}
	}

}
