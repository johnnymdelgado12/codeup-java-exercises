package javareview;

import java.util.ArrayList;

    //We're going to make a computer repair shop.
    // First we need to make a computer project.
    // The computer object should have 3 properties.
    // 1. A string for the computer name
    // 2. A boolean isPowerOn
    // 3. A boolean isBroken
    // All properties need getters and setters EXCEPT isBroken need a getter but NO setter

public class BranceTech {

    private static ArrayList<Computer> brokenComputers = new ArrayList<>();
    private static ArrayList<Computer> fixedComputers = new ArrayList<>();

    private static Clerk brance = new Clerk("Brance");
    private static Repairer johnny = new Repairer("Johnny");


    public static void main(String[] args) {
        Computer testComputer1 = new Computer("Dell", false,true);
        Computer testComputer2 = new Computer("Alien Ware", false,true);
        Computer testComputer3 = new Computer("Apple",false,true);

        brance.receiveComputer(testComputer1, brokenComputers);
        brance.receiveComputer(testComputer2, brokenComputers);
        brance.receiveComputer(testComputer3, brokenComputers);

        for(Computer computer: brokenComputers ){
            System.out.println("computer.getName() = " + computer.getName());
            System.out.println("computer.isBroken() = " + computer.isBroken());
        }

        johnny.repairComputer(brokenComputers, fixedComputers);
        johnny.repairComputer(brokenComputers, fixedComputers);
        System.out.println("-------------------------------");
        for(Computer computer: brokenComputers ){
            System.out.println("computer.getName() = " + computer.getName());
            System.out.println("computer.isBroken() = " + computer.isBroken());
        }

    }

}
