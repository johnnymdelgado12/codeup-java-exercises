import java.util.ArrayList;
import java.util.List;

public class warmups {
//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//    Bonus: Can you do this in one pass?

    public static int[] numberList = new int[]{10,15,3,7};
    public static int k = 17;




    public static void main(String[] args) {

//        for (int i = 0; i < numberList.length -1; ++i){
//            for (int j = i + 1; j < numberList.length; ++j){
//                if (numberList[i] + numberList[j] == k){
//                    System.out.println(numberList[i] + "and" + numberList[j] + "=" + k);
//                }
//            }
//        }

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }

    }

    }
