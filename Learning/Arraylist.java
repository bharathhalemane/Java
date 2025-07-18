package Learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {




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

        /* Finding Index of an Element */
        // The indexOf() method returns the index of the first occurrence of the specified element in the ArrayList.
        // If the ArrayList does not contain the element, -1 is returned
        // As ArrayLists store elements as objects, the search parameter must be given as an object.
        // Syntax: arrList.indexOf(obj);

        int index = agesArrList.indexOf((Integer)10);
//        System.out.println(index);        // output: 1

        /* Finding Frequency of an Element */
        // The Collections.frequency() method is used to find the frequency with which an element occurs in the given ArrayList.
        // The java.util package contains the Collections class.
        // Syntax: Collections.frequency(arrList, obj);
        ArrayList<Integer> arrList3 = new ArrayList<>();
        arrList3.add(3);
        arrList3.add(6);
        arrList3.add(2);
        arrList3.add(1);
        arrList3.add(2);


//        System.out.println(arrList3);         // output: [3, 6, 2, 1, 2]

        // Find the frequency of element 2
        int frequency = Collections.frequency(arrList3, (Integer)2);

//        System.out.println(frequency);        //output: 2

        /* Sorting an ArrayList */
        // The Collections.sort() method can be used to sort the given ArrayList in two different ways.
        // 1. Ascending order
        // 2. Descending order

        /* Ascending Order */
        // Syntax: Collections.sort(arrList);

//        System.out.println(arrList3);           //output: [3, 6, 2, 1, 2]

        // Sorting the ArrayList in ascending order
        Collections.sort(arrList3);

//        System.out.println(arrList3);           //output: [1, 2, 2, 3, 6]

        /* Descending Order */
        // An ArrayList can be sorted in descending order by passing the argument Collection.reverseOrder() to the Collections.sort() method.
        // Syntax: Collections.sort(arrList, Collections.reverseOrder());

        Collections.sort(arrList3, Collections.reverseOrder());
//        System.out.println(arrList3);       //output: [6, 3, 2, 2, 1]

        workingWithArray();
        StringAndArrays();
    }

    static void workingWithArray(){

        // Working with Arrays & ArrayLists //

        // When the array arr2 is assigned with an existing array arr1, both the array variables arr1 and arr2 will refer to the same array.

        // The same applies to ArrayList.

        /* Modifying Arrays */

        int[] arr1 = {34, 45, 19, 21};
        int[] arr2 = arr1;
        arr2[1] = 100;
        arr1[3] = 76;

//        System.out.println(Arrays.toString(arr1));      // output: [34, 100, 19, 76]
//        System.out.println(Arrays.toString(arr2));      // output: [34, 100, 19, 76]

        /* Modifying ArrayList */

        ArrayList<Integer> arrList1  = new ArrayList<>();

        arrList1.add(34);
        arrList1.add(45);
        arrList1.add(19);
        arrList1.add(21);

        ArrayList<Integer> arrList2 = arrList1;

        arrList2.set(1, 100);
        arrList2.set(3, 76);

//        System.out.println(arrList1);               // output: [34, 100, 19, 76]
//        System.out.println(arrList2);               // output: [34, 100, 19, 76]

        // When arr1 and arr2 are referring to the same array and arr2 is assigned a new array,
        // then arr2 refers to the new array and arr1 will be referring to the old array.

        // The same applies to ArrayList.

        /* Modifying Arrays */

         arr1 = new int[]{34, 45, 19, 21};
         arr2 = arr1;

        arr2 = new int[4];

//        System.out.println(Arrays.toString(arr1));      //output: [34, 45, 19, 21]
//        System.out.println(Arrays.toString(arr2));      //output: [0, 0, 0, 0]

        /* Modifying ArrayList */

         arrList1  = new ArrayList<>();

        arrList1.add(34);
        arrList1.add(45);
        arrList1.add(19);
        arrList1.add(21);

         arrList2 = arrList1;

        arrList2 = new ArrayList<>();

//        System.out.println(arrList1);           //output: [34, 45, 19, 21]
//        System.out.println(arrList2);           // output: []

        // Updating immutable objects will not affect the values in an array,
        // as the reference of the immutable object will be changed.

        String name = "John";
        String[] namesArr = {name, "Smith", "Mike"};

//        System.out.println(Arrays.toString(namesArr));      // output: [John, Smith, Mike]

        name = "John Martin";

//        System.out.println(Arrays.toString(namesArr));        // output: [John, Smith, Mike]

        ArrayList<String> arrList3  = new ArrayList<>();

        name = "John";

        arrList3.add(name);
        arrList3.add("Smith");
        arrList3.add("Mike");

//        System.out.println(arrList3);               //output: [John, Smith, Mike]

        name = "John Martin";

//        System.out.println(arrList3);               //output: [John, Smith, Mike]

        // Updating mutable objects will affect the elements in the array

        int[] arr3 = {34, 45, 19, 21};
        int[] arr4 = {42, 152, 737, 2, 79};
        int[][] arr5 = {arr3, arr4};

//        System.out.println(Arrays.deepToString(arr5));      // output: [[34, 45, 19, 21], [42, 152, 737, 2, 79]]

        arr3[1] = 65;
        arr4[4] = 41;

//        System.out.println(Arrays.deepToString(arr5));      // output: [[34, 65, 19, 21], [42, 152, 737, 2, 41]]

    }

    static void StringAndArrays(){
        /* Splitting Strings */
        // The split() method is used to split the string at the specified separator. It returns an array of substrings.
        // Syntax: str.split(separator);

        /* Whitespace as Separator */
        // The whitespace is passed as an argument for the separator.
        // str.split(" "):

        String message = "See you soon";

        String[] messageArr = message.split(" ");

//        System.out.println(Arrays.toString(messageArr));        //output: [See, you, soon]

        /* String as Separator */

    }
}
    