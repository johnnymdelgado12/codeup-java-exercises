import java.sql.SQLOutput;
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
        System.out.printf("please enter a number between %d and %d: ", min, max);
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





    public static void main(String[] args){
    System.out.println(addition(5,10));
    System.out.println(subtraction(25, 15));
    System.out.println(multiplication(5, 10));
    System.out.println(division(15, 3));
    System.out.println(remainder(4, 3));
    int userInput = getInteger(1, 10);
    System.out.printf("%d is a pretty sweet number", userInput);
    System.out.println(factorial());
    }
}
