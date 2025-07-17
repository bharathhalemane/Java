package Learning;

import java.util.Scanner;

public class ArraysL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Introduction
        // an array is an object used to store the collection of data that are of similar data types.


        //Declaration of Array







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
    