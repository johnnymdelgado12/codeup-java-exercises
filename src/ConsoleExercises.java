import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value if pi is approximately %.2f%n", pi);
        System.out.format("The value if pi is approximately %.2f%n", pi);

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter a number");
//        int myNum = input.nextInt();
//        System.out.println(myNum);

//        System.out.println("Please enter 3 words");
//        String wordOne = input.next();
//        String wordTwo = input.next();
//        String wordThree = input.next();
//
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        System.out.println("Please enter a sentence");
//        String mySentence = input.nextLine();
//        System.out.println(mySentence);

        System.out.println("Please enter the width and length of the claasroom");
        String width = input.nextLine();
        String length = input.nextLine();
        System.out.println(Integer.parseInt(width) * Integer.parseInt(length));
    }
}

