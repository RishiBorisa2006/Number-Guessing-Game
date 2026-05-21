import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {


        showWelcome();
        int randomNumber = thinkingNumber();
        int difficulty = chooseDifficulty();
        int chances;
        int attempts = 1;
        int guess;

        if(difficulty == 1){
            chances = 10;
        }
        else if(difficulty == 2){
            chances = 5;
        }
        else {
            chances = 3;
        }

        while(attempts <= chances) {
            if (difficulty == 1){
                System.out.println("Great you have selected the Easy Difficulty.");
                System.out.print("Enter your Guess: ");
                guess = read.nextInt();
                if(randomNumber == guess){
                    System.out.println("You guessed the correct number in " + attempts + ".");
                } else if (randomNumber < guess) {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                    attempts++;
                } else {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                    attempts++;
                }
            }
            else if (difficulty == 2){
                System.out.println("Great you have selected the Medium Difficulty.");
                System.out.print("Enter your Guess: ");
                guess = read.nextInt();
                if(randomNumber == guess){
                    System.out.println("You guessed the correct number in " + attempts + ".");
                } else if (randomNumber < guess) {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                    attempts++;
                } else {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                    attempts++;
                }

            }
            else if (difficulty == 3){
                System.out.println("Great you have selected the Hard Difficulty.");
                System.out.print("Enter your Guess: ");
                guess = read.nextInt();
                if(randomNumber == guess){
                    System.out.println("You guessed the correct number in " + attempts + ".");
                } else if (randomNumber < guess) {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                    attempts++;
                } else {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                    attempts++;
                }
            }
            else{
                System.out.println("Invalid choice.");
            }
        }
    }
    static void showWelcome(){
        System.out.println("Welcome to the Number Guessing Game!");
    }

    static int thinkingNumber() {
        Random rand = new Random();
        int max = 100;
        int min = 1;
        int randomNum = rand.nextInt(max - min + 1) + min;
        System.out.println("I am thinking of a number between 1 and 100.");
        return randomNum;
    }

    static int chooseDifficulty(){
        System.out.println("Please select the difficulty level:\n1. Easy (10 Chances)\n2. Medium (5 Chances)\n3. Hard (3 Chances)");
        System.out.print("Enter your choice: ");
        int difficulty = read.nextInt();
        return difficulty;
    }
}