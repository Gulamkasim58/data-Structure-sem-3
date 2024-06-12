import java.util.Scanner;

public class Vowelornot{
	public static void main(String[] args) {

		System.out.println("enter Character:");
		Scanner sc= new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println("Character is vowel");
		}
		else{
			System.out.println("Character is not vowel");
		}
		
	}
}