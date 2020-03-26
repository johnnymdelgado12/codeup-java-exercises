public class Person {
    private String name;

    public Person(String newName) {
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


    public static void main(String[] args){
//        Person person1 = new Person("Johnny");
//        System.out.println(person1.getName());
//        person1.sayHello();
//        person1.setName("Jo");
//        System.out.println(person1.getName());
//        person1.sayHello();
//        person1.setName("Jonathon");
//        System.out.println(person1.getName());
//        person1.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
