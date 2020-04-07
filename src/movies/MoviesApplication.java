package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        int option;

        do {
            System.out.println("\n*--------------------Movies List---------------------*");
            System.out.printf("|%-26s %25s|","","");
            System.out.printf("\n|\t%-44s %4s|"," What would you like to do?","");
            System.out.printf("\n|%-26s %25s|","","");
            System.out.printf("\n|\t%-44s %4s|"," 0 - Exit.","");
            System.out.printf("\n|\t%-44s %4s|"," 1 - View all movies.","");
            System.out.printf("\n|\t%-44s %4s|"," 2 - View movies in animated category.","");
            System.out.printf("\n|\t%-44s %4s|"," 3 - view movies in the drama category.","");
            System.out.printf("\n|\t%-44s %4s|"," 4 - view movies in the horror category.","");
            System.out.printf("\n|\t%-44s %4s|"," 5 - view movies in the sci-fi category.","");
            System.out.printf("\n|%-26s %25s|","","");
            System.out.println("\n*----------------------------------------------------*\n");
            System.out.print("");
            System.out.println(">");
            option = input.getInt();


            switch (option){
                case 0:
                    System.out.println("Have a nice day!");
                    break;

                case 1:
                    System.out.println("Here are all the movies: ");
                    System.out.println(Arrays.toString(MoviesArray.findAll()));

                case 2:
                    System.out.println("Here are all the movies in the animated category: ");
                    break;

                case 3:
                    System.out.println("Here are all the movies in the drama category: ");
                    break;

                case 4:
                    System.out.println("Here are all the movies in the horror category: ");
                    break;

                case 5:
                    System.out.println("Here are all the movies in the sci-fi category: ");
            }

        } while (option != 0);

    }
}
