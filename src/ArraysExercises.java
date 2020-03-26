import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];

        Person johnny = new Person("Johnny");
        Person joanna = new Person("Joanna");
        Person travis = new Person("Travis");

        people[0] = johnny;
        people[1] = joanna;
        people[2] = travis;

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person brance = new Person("Brance");
        Person[] newPeople = addPerson(people, brance);



        for (Person person : newPeople) {
            System.out.println(person.getName());
        }
    }


    //create a static method named addPerson
    //accept an array of Person objects as well as a single person object to add to the passed array
    //should return an array
    //the array length should be 1 greater than the passed array
    //the passed person object should be the last thing in the array
    public static Person[] addPerson(Person[] people, Person peeps ){
        int size = people.length + 1;
        Person[] bucket = Arrays.copyOf(people, size);
        int lastIndex = bucket.length -1;
        bucket[lastIndex] = peeps;
        return bucket;
    }

}
