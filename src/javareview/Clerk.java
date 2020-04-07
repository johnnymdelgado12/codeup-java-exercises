package javareview;

import java.util.ArrayList;

public class Clerk extends Human{

    public Clerk(String name){
        super(name);
    }
    public void receiveComputer(Computer inComingBrokenComputer, ArrayList<Computer> thiStoresBrokenComputerPile){
        thiStoresBrokenComputerPile.add(inComingBrokenComputer);
    }
}
