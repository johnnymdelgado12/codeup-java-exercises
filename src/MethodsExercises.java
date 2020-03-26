import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

//    1. Basic Arithmetic
//    Create four separate methods. Each will perform an arithmetic operation:
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int remainder(int a, int b){
        return a % b;
    }

//    2. Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.printf("please enter a number between %d and %d: \n", min, max);
        int numInput = input.nextInt();
        if(numInput < min || numInput > max){
            System.out.println("That number is not in range!");
            return getInteger(min, max);
        }
            return numInput;
    }


//    3. Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.

    public static long factorial(){
        System.out.println("Please enter a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        long numInput = input.nextInt();
        if(numInput < 1 || numInput > 10){
            System.out.println("sorry but that number is not in range!");
            return factorial();
        } else {
            long result = 1, i;
            for (i = 2; i <= numInput; i++)
                result *= i;
            return result;

        }
    }

//    4. Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//    Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


    public static long diceRoll() {
        Scanner input = new Scanner(System.in);
        System.out.println("wanna roll the dice? [y/n]");
        String choice = input.nextLine();
        long diceTotal = 0;
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("how many sides of the dice are there?");
            long diceSides = input.nextInt();
            long min = 1;
            long roll1 = (long) (Math.random() * diceSides) + min;
            long roll2 = (long) (Math.random() * diceSides) + min;
//            System.out.printf("You rolled %d and %d", roll1, roll2);
            diceTotal = roll1 + roll2;
        }
        return diceTotal;
    }


    public static void main(String[] args) {
        System.out.println(addition(5, 10));
        System.out.println(subtraction(25, 15));
        System.out.println(multiplication(5, 10));
        System.out.println(division(15, 3));
        System.out.println(remainder(4, 3));
        int userInput = getInteger(1, 10);
        System.out.printf("%d is a pretty sweet number", userInput);
        System.out.println(factorial());
        long vegasBaby = diceRoll();
        System.out.printf("You rolled a %d!", vegasBaby);
    }
}
