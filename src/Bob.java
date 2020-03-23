import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String questionForBob = input.nextLine();

        if (questionForBob.endsWith("?")){
            System.out.println("Sure");
        } else if (questionForBob.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (questionForBob.equals("")){
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
