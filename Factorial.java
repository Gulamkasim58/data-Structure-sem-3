import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		int ans=1, count=0;
			System.out.println("enter number:");
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();

		for(int i=1;i<=n;i++){

			 ans=ans*i;
			 // System.out.println("factorial is :"+ans);


		}
		System.out.println("factorial is :"+ans);
	}
}	