import java.util.Scanner;
public class Areaofcircle{
	public static void main(String[] args) {
        
        System.out.println("enter radius:");
		Scanner sc= new Scanner(System.in);
		double rad=sc.nextDouble();

		Double area=Math.PI*rad*rad;

		System.out.println("area:"+area);




		
	}
}