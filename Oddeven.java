import java.util.Scanner;

public class Oddeven{
	public static void main(String[] args) {

		System.out.println("enter number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();

		if(num%2==0){
			System.out.println("number is even:");
		}
		else{
			System.out.println("number is odd");
		}
		
	}
}