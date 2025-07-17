package Learning;

import java.util.Arrays;
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

        players.get(1);

//        System.out.println(players.get(1));     //output: wade

        /* Printing an ArrayList */

//        System.out.println(players);        //output: [Bryant, Wade]

        /* Modifying an ArrayList */
        // The set() method is used to replace or modify an element in the ArrayList.
        // Syntax: arrList.set(index, element);

//        System.out.println("Before modification: "+players);      // output: Before modification: [Bryant, Wade]
        players.set(1,"Garnett");
//        System.out.println("After modification: "+players);     // output: After modification: [Bryant, Garnett]


        /* Adding Primitive Data Types to ArrayLists */
        // ArrayList can only store objects. To use primitive data types, we have to convert them to objects.
        // Wrapper classes are can be used to convert primitive types into corresponding objects.
        /*
                Primitive Type | Wrapper Class
                ------------------------------
                      byte     |      Byte
                    boolean    |     Boolean
                      char     |    Character
                     double    |      Double
                      float    |      Float
                       int     |     Integer
                      long     |      Long
                     short     |      Short
         */

        ArrayList<Integer> points = new ArrayList<>();

        points.add(80);
        points.add(75);
        points.add(84);

//        System.out.println(points);             //output: [80, 75, 84]

        /* Autoboxing and Unboxing */
        // Autoboxing and unboxing are the processes in which the Java compiler automatically converts
        // primitive types into their corresponding wrapper class objects and vice versa

        /* AutoBoxing */
        // The conversion of primitive types into their corresponding wrapper class objects is called Autoboxing.

        int num =23;
        Integer numObj = num; //autoboxing
//        System.out.println(numObj);           //output: 23

        /* Unboxing */
        // The conversion of wrapper class objects into their corresponding primitive types is called Unboxing.
        Integer numObj2 = 23;
        int num2 = numObj2;         //unboxing
//        System.out.println(num);                //output: 23

        /* Removing ArrayList Elements */
        // The remove() method

        /* Removing Elements using Index */
        // The remove() method removes the elements the element at specified position, that is index in the ArrayList
        // Syntax: arrList.remove(index);


//        System.out.println("Before Removing: " + points);   //output: Before Removing: [80, 75, 84]

        points.remove(1);   //removing the element at index 1

//        System.out.println("After Removing: " + points);    //output: After Removing: [80, 84]


        /* Removing Elements using an Element */
        // when an object is passed as an argument, the remove() method removes the first occurrence of the specified element
        // from the ArrayList if it is present. If the ArrayList does not contain the element, the ArrayList remains unchanged.
        // Syntax: arrayList.remove(obj);

//        System.out.println("Before Removing: " + players);      //output: Before Removing: [Bryant, Garnett]

        players.remove("Garnett"); // removing the first occurrence of the element "Garnett"

//        System.out.println("After Removing: " + players);       // output: After Removing: [Bryant]

        /* clear() */
        // The clear() method completely removes all the elements from the ArrayList.
        // Syntax: arrList.clear();

        players.add("Wade");
        players.add("Garnett");
        players.add("Rose");

//        System.out.println(players) ;       //output: [Bryant, Wade, Garnett, Rose]

        players.clear(); // removing all the elements from the Arraylist

//        System.out.println(players) ;       //output: []


        /* Size of an ArrayList */
        // The size() method is used to find the size of an ArrayList.
        // Syntax: arrList.size();

//        System.out.println(points);                // output: [80, 84]
//        System.out.println(points.size());      //output: 2

        /* Iterating over an ArrayList */
        // for each loop
        players.add(0, "Bryant");
        players.add("Wade");
        players.add("Garnett");
        players.add("Rose");


        for (String name : players) {
//            System.out.println(name);
        }

        /* ArrayList Concatenation */
        // The addAll() method is used to concatenate two ArrayLists.
        // This method appends the second ArrayList to the end of the first ArrayList.
        // Syntax: arrList1.addAll(arrList2);

        ArrayList<Integer> arrList1 = new ArrayList<>();

        arrList1.add(5);
        arrList1.add(10);
        arrList1.add(15);
        arrList1.add(20);

//        System.out.println("arrList1: " + arrList1); // [5, 10, 15, 20]

        ArrayList<Integer> arrList2 = new ArrayList<>();

        arrList2.add(25);
        arrList2.add(30);
        arrList2.add(35);
        arrList2.add(40);


//        System.out.println("arrList2: " + arrList2); // [25, 30, 35, 40]

        arrList1.addAll(arrList2);

//        System.out.println("arrList1 after concatenation: " + arrList1); // [5, 10, 15, 20, 25, 30, 35, 40]


        /* ArrayList Slicing */
        // The subList() method is used for slicing of ArrayLists. It works similar to the copyOfRange() method in Arrays.
        // Syntax: arrList.subList(startIndex, endIndex);

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(5);
        arrList.add(10);
        arrList.add(15);
        arrList.add(20);

        ArrayList<Integer> subArrList = new ArrayList<>(arrList.subList(1, 3)); // [10, 15]

//        System.out.println(subArrList);

        /* Converting Array to ArrayList */
        // The asList() method from the Arrays class is used to convert an Array to an ArrayList
        // by passing it as an argument to the constructor of ArrayList.
        // Syntax: Arrays.asList(arr);

        String[] sportsArr = {"Basketball", "Cricket", "Football"};

//        System.out.println("Type of sportsArr: " + sportsArr.getClass().getSimpleName());

        ArrayList<String> sportsArrList = new ArrayList<>(Arrays.asList(sportsArr)); // converting Array to ArrayList

//        System.out.println("sportsArrList: " + sportsArrList); // [Basketball", "Cricket", "Football]
//        System.out.println("Type of sportsArrList: " + sportsArrList.getClass().getSimpleName());

        /* Converting ArrayList to Array */
        // The toArray() method is used to convert Arraylist to Array
        // Syntax: arrList.toArray(arr);

        ArrayList<Integer> agesArrList = new ArrayList<>();

        agesArrList.add(5);
        agesArrList.add(10);
        agesArrList.add(15);

//        System.out.println("Type of agesArrList: " + agesArrList.getClass().getSimpleName());

        Integer[] agesArr = new Integer[agesArrList.size()]; // new Integer[3]

        agesArrList.toArray(agesArr);

//        System.out.println("agesArr: " + Arrays.toString(agesArr)); // [5, 10, 15]

//        System.out.println("Type of agesArr: " + agesArr.getClass().getSimpleName());
































        sc.close();
    }
}
    