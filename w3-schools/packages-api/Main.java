import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int usersNumber = myScanner.nextInt();
        System.out.println("Your number is" + usersNumber);
        int usersNumberInHalf = (usersNumber / 2);
        System.out.println("Your number in half is " + usersNumberInHalf);
    }
}
