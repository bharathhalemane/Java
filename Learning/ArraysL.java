package Learning;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Introduction
        //-------------
        // an array is an object used to store the collection of data that are of similar data types.


        //Declaration of Array
        //Syntax: dataType[] arrayName;

        int[] arr1; // declaring an array name called arr1

        //Creating and Initializing an Array
        //Syntax: dataType[] arrayName = { val1, val2, val3,...};

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};  //declaring, creating and initialized in a single statement

        //Accessing Array Elements
        //Syntax: arrayName[index];

        int num = arr2[2]; // output: 30

        //Printing an Array
        //the Arrays class provides a method toString(), which can be used to print array in java.
        //Syntax: Arrays.toString(arrayName);

//      System.out.println(Arrays.toString(arr2)); //output: [10, 20, 30, 40, 50, 60, 70, 80, 90]

        //Modifying Array Elements
        //the array elements at any position can be modified but with the same data type.

        arr2[0]=100;
        arr2[1]=110;

//      System.out.println(Arrays.toString(arr2)); //output: [100, 110, 30, 40, 50, 60, 70, 80, 90]

        //Creating an Array using a " new " Keyword
        //using this we can create an array of required length and later assign the values.
        //Syntax: dataType[] arrayName = new dataType[size];

        int[] arr3 = new int[3]; //example

        //Assigning Values
        arr3[0]=1;
        arr3[1]=1;
        arr3[2]=2;

//      System.out.println(Arrays.toString(arr3)); //output: [1, 2, 3]

        //Length of an Array
        // we can find the array length by using the attribute " length "
        // arrayName.length

        int lengthOfArr = arr3.length;

//      System.out.println(lengthOfArr); //output: 3









        // 1D Array
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};

        int[] concatArray=MyMethods.concatArray(arr1,arr2);     //Check MyMethods java class
//        System.out.println(Arrays.toString(concatArray));

        int[] newArray= java.util.Arrays.copyOfRange(arr1,1,3);
//        System.out.println(Arrays.toString(newArray));


        //2D Array
        int[][] arrays = new int[2][3];             //declaration
        arrays = new int[][]{{1,2,3},{4,5,6}};     //Initialization

        // method 1 to print
//        System.out.println(Arrays.deepToString(arrays));

        //method 2
//        for(int[] arr: arrays){
//            System.out.println(Arrays.toString(arr));
//        }


        sc.close();
    }




}
    