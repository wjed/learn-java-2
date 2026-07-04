import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your temperature: ");
        int input = Integer.parseInt(scanner.nextLine());
        if (input >= 80) {
            System.out.println("Damn, it's hot!");
        } 
        else if (input >= 50 && input < 80) {
            System.out.println("You'll be good!");
        } 
        
        else {
            System.out.println("Getting Colder!");
        }
    }
}