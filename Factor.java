import java.util.Scanner;

public class Factor {

  public static void main(String[] args) {


    System.out.println("enter number:");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();


    for (int i = 1; i <=n; ++i) {

      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}