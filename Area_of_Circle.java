package area_of_circle;
import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

		 double result;
		 System.out.println("enter a radius");
		 double r = input.nextDouble();
		 double sum = Math.pow(r, 2);
		 result = Math.PI * sum;
		 System.out.println(result);
	}
}
