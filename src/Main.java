import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {


        showWelcome();
        boolean playAgain = true;

        while(playAgain) {
            int secretNumber = generateNumber();
            int difficulty = chooseDifficulty();
            int chances = 0;
            int attempts = 0;
            int guess;
            boolean won = false;
            if(difficulty == 1){
                chances = 10;
                System.out.println("Great you have selected the Easy Difficulty.");
            }
            else if(difficulty == 2){
                chances = 5;
                System.out.println("Great you have selected the Medium Difficulty.");
            }
            else if(difficulty == 3) {
                chances = 3;
                System.out.println("Great you have selected the Hard Difficulty.");
            }

            while(attempts < chances) {
                System.out.print("Enter your Guess: ");
                guess = read.nextInt();
                attempts++;
                if(secretNumber == guess){
                    System.out.println("You guessed the correct number in " + attempts + ".");
                    won = true;
                    break;
                } else if (secretNumber < guess) {
                    System.out.println("Incorrect! The number is less than " + guess + ".");
                } else {
                    System.out.println("Incorrect! The number is greater than " + guess + ".");
                }
            }
            if(won == true){
                System.out.println("Congratulations! You win!");
            }
            else if (won == false){
                System.out.println("You lose!");
            }
            System.out.println("Enter 1 to play again and 0 to quit: ");
            int replayChoice =  read.nextInt();
            if(replayChoice == 1){
                playAgain = true;
            }
            else if(replayChoice == 0){
                break;
            }
        }

    }

    static void showWelcome(){
        System.out.println("Welcome to the Number Guessing Game!");
    }

    static int generateNumber() {
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