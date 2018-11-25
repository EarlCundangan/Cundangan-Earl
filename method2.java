package meth;
import java.util.*;
public class method2 {

	public static void main(String[] args) {
		
		display();
		
	}
	static int  fbi(int n) {
		if(n==0) {
			return 0;
		}else 
			if(n==1) {
			return 1;
			}
			else 
			return fbi(n-1)+fbi(n-2);	
	}
	static void display() {
		
		Scanner in = new Scanner(System.in);


	        System.out.println("Enter a number.");
	        int loli = in.nextInt();

	        for (int count = -1; count <loli; count++) {
	        	int swat =count+1;
	        	System.out.print("f("+swat+")\t");
	        }
	        for(int i=-1; i<loli; i++) {
	        	
	        	System.out.println();
	        	for(int j= -1;  j<i; j++) {
	        		int lolicon = fbi(j+1);
	        		System.out.print(lolicon+"\t");
	        	}
	        	
	        }
	}
	}


