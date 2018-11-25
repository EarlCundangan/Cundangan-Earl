package java_programs;
import java.util.*;
public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	int sum;
		System.out.println("Enter value a");
		int a = in.nextInt();
		System.out.println("Enter value b");
		int b  = in.nextInt();
		System.out.println("Enter value aritmetic");
		String user = in.next();
		switch(user) {
		case ("+"):
		case ("add"):
			 sum=a+b;
		System.out.println("the sum is = "+sum);
		break;
		case("substract"):
		case ("-"):
			 sum=a-b;
		System.out.println("the difference is = "+sum);
		break;
		case("multiply"):
		case ("*"):
			 sum=a*b;
		System.out.println("the product is = "+sum);
		break;
		case("divide"):
		case ("/"):
			 sum=a/b;
		System.out.println("the quotient is = "+sum);
		break;
		case("modulo"):
		case ("%"):
			 sum=a%b;
		System.out.println("the modulo is = "+sum);
		break;
		default:
			System.out.println("mali bawal yan");
		}
	}

}
