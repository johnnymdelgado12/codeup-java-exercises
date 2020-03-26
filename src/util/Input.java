package util;

import java.util.Scanner;

public class Input {
    private Scanner s = new Scanner(System.in);

    public String getString(){
        return s.nextLine().trim().toLowerCase();
    }

    public boolean yesNo(){
        System.out.println("Type [y/n]: ");
        String myStr = getString();
        return (myStr.equalsIgnoreCase("yes") || (myStr.equalsIgnoreCase("y")));
    }

    public int getInt(){
        System.out.println("Give me a number: ");
        String myStr = getString();
        return Integer.parseInt(myStr);
    }

    public int getInt(int min, int max){
        System.out.printf("Give me number between %d and %d:\n",min, max);
        String myStr = getString();
        int num = Integer.parseInt(myStr);
        if (num < min || num > max){
            System.out.printf("Give me number between %d and %d:\n",min, max);
            myStr = getString();
            num = Integer.parseInt(myStr);
        }
        return num;
    }

}
