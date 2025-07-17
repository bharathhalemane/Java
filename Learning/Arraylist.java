package Learning;

import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /* Introduction */
        // The size of ArrayLists is dynamic. that is size of the ArrayList can be changed.

        // we want to import ArrayList class from the package java.util
        // we cannot store primitive data types directly
        // An ArrayList can only store objects

        // Syntax: ArrayList<Type> arrList = new ArrayList<>();

        ArrayList<String> players = new ArrayList<>();

        /* Adding Elements to ArrayList */
        // The add() method is used to add a single elements to the ArrayList
        // Syntax: arrList.add(index, element);
        // index optional
        // index is not passed, the element is appended to the end of the ArrayList.

        players.add(0, "Bryant");
        players.add("Wade");

        /* Accessing ArrayList Elements */
        // The get() method is used to access an element from an ArrayList.
        // Syntax: arrList.get(index);

        System.out.println(players.get(1));



































        sc.close();
    }
}
    