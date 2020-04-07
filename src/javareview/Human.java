package javareview;

public class Human {

    private String name;

    public Human(String newName) {
        this.name = newName;
        System.out.printf("%s has been created\n", newName);
    }

    // returns the person's name
    public String getName(){
        return String.format("Name: %s", name);
    };
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    };
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("%s says hello! \n", this.name);

    };
}
