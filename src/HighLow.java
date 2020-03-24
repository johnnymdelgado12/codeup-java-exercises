import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
//        5. Game Development 101
//
//        Welcome to the world of game development!
//        You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//        The specs for the game are:
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"

        Scanner input = new Scanner(System.in);
        long randomNum = (long) (Math.random() * 100) + 1;
        System.out.println("Pick a number between 1 and 100: ");
        int userInput = 0;
        while (userInput != randomNum){
            userInput = input.nextInt();
            if (userInput < randomNum){
                System.out.println("HIGHER");
            } else if (userInput > randomNum){
                System.out.println("LOWER");
            } else if (userInput == randomNum){
                System.out.println("GOOD GUESS!");
            }
        }
    }
}
