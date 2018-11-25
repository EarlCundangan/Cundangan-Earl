package area_of_Rectangles;
import java.util.Scanner;
public class areofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		/*double sum;
		
		System.out.println("Enter width");
		double w = input.nextDouble();
		
		System.out.println("Enter width");
		double l =input.nextDouble();
		 sum= w * l;
		 System.out.println(""+sum);*/
		double sum;
		System.out.println("Enter height");
		double h = input.nextInt();
		
		System.out.println("Enter base");
		double b = input.nextInt();
		
		sum = h*b/2;
		System.out.println("the area of rectangle is: " + sum);
		
	}

}
