import java.util.Arrays;

public class ServerNameGenerator {
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and
//    adjective and hyphenate the combination and display the generated name to the user.


    public static String[] nouns = {"men", "women", "dog", "cat", "singer", "bear", "spider", "cookies", "friends","meat"};
    public static String[] adjectives = {"beautiful", "scary", "small", "glamorous", "silly", "lazy", "mysterious", "short", "tall", "big"};

    public static String nameGen(){
        int i = (int)(Math.random() * 10) + 1;
        return "\t" + adjectives[i] + "-" + nouns[i];
    }

    public static void main(String[] args){
        System.out.println(nameGen());
    }

}
