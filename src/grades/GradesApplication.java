package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();

        students.put("johnnymdelgado12", new Student("Johnny"));
        students.put("jojobeanz", new Student(" Joanna"));
        students.put("travisty", new Student ("Travis"));
        students.put("trixkhakis", new Student ("Trix"));
        students.put("loonyloon", new Student("Luna"));


        students.get("johnnymdelgado12").addGrade(90);
        students.get("johnnymdelgado12").addGrade(81);
        students.get("johnnymdelgado12").addGrade(85);

        students.get("jojobeanz").addGrade(100);
        students.get("jojobeanz").addGrade(99);
        students.get("jojobeanz").addGrade(95);

        students.get("travisty").addGrade(97);
        students.get("travisty").addGrade(90);
        students.get("travisty").addGrade(82);

        students.get("trixkhakis").addGrade(88);
        students.get("trixkhakis").addGrade(83);
        students.get("trixkhakis").addGrade(94);

        students.get("loonyloon").addGrade(77);
        students.get("loonyloon").addGrade(87);
        students.get("loonyloon").addGrade(74);




        System.out.println("\tWelcome! \n");
        System.out.println("\tHere are the GitHub usernames of our students: \n");
        System.out.println("\t| johnnymdelgado12 | jojobeanz | travisty | trixkhakis | loonyloon \n" );
        System.out.println("\tWhat student would you like to see more information on? \n");

        String reply;

        boolean confirm;

//        do {
//            confirm = true;
//            System.out.println("What student would you like to see more information on?");
//            reply = input.nextLine();
//            if (!students.containsKey(reply)){
//                System.out.println("\tSorry, no student found with the GitHub username of \"pizza\".\n" + "\n" + "Would you like to see another student?\n");
//            } else {
//                Student newStudent =  students.get(reply);
//                System.out.println("\tName: " + newStudent.getName() + " - " + "GitHub Username: " + reply + "\n\tCurrent Grade Average: " + newStudent.getGradeAverage());
//                System.out.println("Would you like to see another student? [y/n]");
//                if (input.nextLine().equals("y")){
//                    confirm == true;
//                } else {
//                    confirm == false;
//                }
//            }
//
//
//        } while(confirm == true);


    }
}
