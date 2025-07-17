package Learning;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Introduction */
        //-------------
        // an array is an object used to store the collection of data that are of similar data types.


        /* Declaration of Array */
        // Syntax: dataType[] arrayName;

        int[] arr1; // declaring an array name called arr1

        /* Creating and Initializing an Array */
        // Syntax: dataType[] arrayName = { val1, val2, val3,...}

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};  //declaring, creating and initialized in a single statement

        /* Accessing Array Elements */
        // Syntax: arrayName[index];

        int val = arr2[2]; // output: 30

        /* Printing an Array */
        // The Arrays class provides a method toString(), which can be used to print array in java.
        // Syntax: Arrays.toString(arrayName)

//      System.out.println(Arrays.toString(arr2)); //output: [10, 20, 30, 40, 50, 60, 70, 80, 90]

        /* Modifying Array Elements */
        // The array elements at any position can be modified but with the same data type.

        arr2[0]=100;
        arr2[1]=110;

//      System.out.println(Arrays.toString(arr2)); //output: [100, 110, 30, 40, 50, 60, 70, 80, 90]

        /* Creating an Array using a " new " Keyword */
        // using this we can create an array of required length and later assign the values.
        // Syntax: dataType[] arrayName = new dataType[size];

        int[] arr3 = new int[3]; //example

        /* Assigning Values */
        arr3[0]=1;
        arr3[1]=1;
        arr3[2]=2;

//      System.out.println(Arrays.toString(arr3)); //output: [1, 2, 3]

        /* Length of an Array */
        // we can find the array length by using the attribute " length "
        // arrayName.length

        int lengthOfArr = arr3.length;

//      System.out.println(lengthOfArr); //output: 3

        /*  Iterating Over an Array */
        /* Using for Loop */
        int n= arr3.length;
        for (int i = 0; i < n; i++) {
//            System.out.print(arr3[i]+" "); //output: 1 2 3
        }

        /* Using for-each Loop */

        for (int num : arr3){
//            System.out.print(num+" ");    //output: 1 2 3
        }

        /* Read & Store User Inputs in an Array */
/*
        int size = sc.nextInt();
        int[] inputArr=new int[size];
        for(int i=0;i<size;i++){
            inputArr[i]=sc.nextInt();
        }

*/

        /* Array Concatenation */
        // In java System class contains a method named arrayCopy() to concatenate two arrays.
        // Syntax: System.arrayCopy(array1, array1StartPosition, array2, array2StartPosition, noOfElement);

        int[] arr4={1,2,3,4};
        int[] arr5={5,6,7,8};

        // Enhanced by me to check actual work goto MyMethods class
        int[] concatArray=MyMethods.concatArray(arr4,arr5);     //Check MyMethods java class
//        System.out.println(Arrays.toString(concatArray));     // output: [1, 2, 3, 4, 5, 6, 7, 8]


        /* Array Slicing */
        // It is a method of obtaining a subArray of an array
        // Using method copyOfRange() from Arrays Class
        // Syntax: Arrays.copyOfRange(arrayName, startIndex, endIndex);

        int[] newArray= java.util.Arrays.copyOfRange(arr4,1,3);
//        System.out.println(Arrays.toString(newArray));    //output: [2, 3]

        /* Multi Dimensional Array */
        // A multidimensional array consists of an array of arrays.


        // 2D Array
        // Syntax: dataType[][] arrayName= { { val1, val2, ...}, {val1, val2, ...}};

        int[][] arrays = {{1,2,3},{4,5,6}}; //creating and initializing


        /* Accessing 2D Array */
        // Syntax: arrayName[rowNo][colNo];

//        System.out.println(arrays[0][0]); //output: 1
//        System.out.println(Arrays.toString(arrays[0]));  //output: [1, 2, 3]

        /* Printing a 2D Array */

        // method 1
//        System.out.println(Arrays.deepToString(arrays));    //output: [[1, 2, 3], [4, 5, 6]]

        //method 2
/*        for(int[] arr: arrays){
            System.out.print(Arrays.toString(arr)); //output: [1, 2, 3][4, 5, 6]
        }
*/

        /* Creating a 2D array using " new " Keyword */
        // Syntax: dataType[][] arrayName = new dataType[rows][cols];

        int[][] arrys2;         //declaring an array
        arrys2 = new int[2][2];     //allocating memory for arr

        //assigning values to first row
        arrys2[0][0]=12;
        arrays[0][1]=46;

        //assigning values to second row
        arrays[1][0] = 61;
        arrays[1][1] = 90;

//        System.out.println(Arrays.deepToString(arrays));  //output: [[12, 46],[61, 90]]


        /* Iterating Over a 2d array */
        // we can use nested loops to iterate over a two-dimensional array

        int rows=arrays.length;
        int cols =arrays[0].length;
/*
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                System.out.println(arrays[i][j]);
            }
        }
*/

        /* Read & Store User Inputs in a two-dimensional array */
/*
        int rows = sc.nextInt();                            // reads the number of rows
        int cols = sc.nextInt();                            // reads the number of cols

        int[][] arr = new int[rows][cols];                  // creating a 2d array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();                   //reading and storing user inputs in array
            }
        }
 */
        sc.close();
    }




}
    