import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        System.out.println("I am thinking of a number between 1 and 100.");

        int max = 100;
        int min = 1;
        int randomNum = rand.nextInt(max - min + 1) + min;

        while (true) {
            System.out.println("Please select the difficulty level:\n1. Easy (10 Chances)\n2. Medium (5 Chances)\n3. Hard (3 Chances)");

            System.out.print("Enter your choice: ");
            int difficulty = read.nextInt();

            if (difficulty == 1){
                System.out.println("Great you have selected the Easy Difficulty.");
            }
            else if (difficulty == 2){
                System.out.println("Great you have selected the Medium Difficulty.");
            }
            else if (difficulty == 3){
                System.out.println("Great you have selected the Hard Difficulty.");
            }
            else{
                System.out.println("Invalid choice.");
            }
        }
    }
}