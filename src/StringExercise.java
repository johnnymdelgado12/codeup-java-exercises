public class StringExercise {
    public static void main(String[] args){

    String theWall = "We dont need no education\nWe dont need no thought control";
    System.out.println(theWall);

    String check = "Check \"this\" out!, ";
    check = check + check.charAt(10) + "inside";
//    check = check + check.substring(10, 12) + " inside of " + check.substring(10, 12);
    System.out.println(check);
    }
}
