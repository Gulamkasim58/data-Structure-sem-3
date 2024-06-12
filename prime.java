import java.util.Scanner;
	
public class prime{
	public static void main(String[] args) {

    // int num = 29;
    System.out.println("enter number:");
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    boolean flag = true;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        flag = false;
        break;
      }
    }

    if (flag==true)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}