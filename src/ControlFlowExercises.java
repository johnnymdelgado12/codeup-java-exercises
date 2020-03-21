public class ControlFlowExercises {
    public static void main(String[] args) {

//        1.a. Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        int i = 5;
//        while (i <= 14){
//            i++;
//            System.out.println(i);
//        }



//        1.b.1. Create a do-while loop that will count by 2's starting with 0 and ending at 100.
//        Follow each number with a new line.
//          int i = 0;
//          do {
//              ++i;
//              if(i % 2 == 0){
//                  System.out.println(i);
//              }
//          }while (i <= 100);



//       1.b.2. Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 105;
//        do {
//            i--;
//            if (i % 5 == 0){
//                System.out.println(i);
//            }
//        } while (i >= -10);



//       1.b.3. Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        Output should equal:
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//
//        } while(i <= 1000000);


//       1.c.1. Refactor the previous two exercises to use a for loop instead.
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *=i){
//
//            System.out.println(i);
//        }

//        2. Fizzbuzz

        for(int i = 0; i <= 100; i++ ){
            if (i % 15 == 0){
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
    }

