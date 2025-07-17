package Learning;


public class MyMethods {
        public static int[] concatArray(int[] arr1, int[] arr2){
            int[] newArray=new int[arr1.length+arr2.length];

            System.arraycopy(arr1, 0, newArray, 0, arr1.length);
            System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
            return newArray;
        }
}
    