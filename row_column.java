package java_programs;
import java.util.*;
public class row_column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        
	        System.out.println("Enter Row Size:");
	        int x = in.nextInt();
	        System.out.println("Enter Column Size:");
	        int y = in.nextInt();
	        
	        int[][] a = new int[x][y];
	        
	        System.out.println("Enter elements:");
	        
	        
	        
	        for(int i = 0; i < x; i++){
	            for(int j = 0; j < y; j++){
	                System.out.println("Row"+i+"Column"+j+":");
	                a[i][j]=in.nextInt();
	            }
	        }
	        System.out.println("Elements:");
	        for (int[] t : a) {
	            for (int b : t) {
	                System.out.print(b + "\t");
	            }
	            System.out.println("\n");
	        }
	        
	        
	        
	        System.out.print("row size is:"+x+" ");
	        System.out.println("column size is:"+y);
	        
	    }
	    
	}
