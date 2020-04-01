import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        ArrayList<String> roast = new ArrayList<>();
        //   add light, medium, medium, dark to the array list, one at a time
        roast.add("light");
        roast.add("medium");
        roast.add("medium");
        roast.add("dark");

        System.out.println(roast);
        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result = roast.contains("dark");
        System.out.println(result);
        result = roast.contains("espresso");
        System.out.println(result);
        // 3. Find the last index of "medium" in the array
        int index = roast.lastIndexOf("medium");
        System.out.println(index);
        // 4. Check if the array list is empty
        result = roast.isEmpty();
        System.out.println(result);
        ArrayList<String> emptyList = new ArrayList<>();
        result = emptyList.isEmpty();
        System.out.println(result);
        // 5. Assign the array list an empty ArrayList object, and then check if empty
        roast.add("espresso");
        System.out.println(roast);
        // 6. Remove the espresso roast
        roast.remove(4);
        System.out.println(roast);
        // 7. Remove the element at index 2
        roast.remove(2);
        System.out.println(roast);



        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> username = new HashMap<>();

        username.put("Casey", "fridaynext");
        username.put("Vivian", "viviancan");
        username.put("Trant", "trantbatey");
        System.out.println(username);
        // 2. re-initialize the HashMap using the .clear() method
        username.clear();
        System.out.println(username);
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        username.put("Casey","fridaynext");
        System.out.println(username);
        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        username.putIfAbsent("Vivian", "viviancan");
        username.putIfAbsent("Casey", "xpenguinx");
        System.out.println(username);
        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        // 6. Use the .remove() method to remove "Casey"
        username.remove("Casey");
        System.out.println(username);
        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        username.replace("Vivian", "viviancandev");
        System.out.println(username);
        // 8. Use the .clear() method to clear the map
        username.clear();
        System.out.println(username);
        // 9. Use the .isEmpty() method to verify that it was cleared
        result = username.isEmpty();
        System.out.println(result);

    }
}
