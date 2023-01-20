package labexam;
import java.util.Scanner;
public class exam {
	public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num = number.nextInt();
	if  (num % 2 == 0 )
	            System.out.println(num + " is even");
	        else
	            System.out.println(num + " is prime");
	    }
	}

