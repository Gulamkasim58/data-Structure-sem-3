import java.util.Scanner;

public class SecondsToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is equal to " + minutes + " minutes and " + remainingSeconds + " seconds.");
}
}