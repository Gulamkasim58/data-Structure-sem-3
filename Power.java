public class Power{
	 public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        double result = 1.0;
        
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        
        System.out.println("power is "+ result);
    }
}
