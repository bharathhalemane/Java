//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
package LeetCode;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));


        sc.close();
    }



    static int findNumbers(int[] nums) {
        int total=0;
        for(int num:nums){
            if(count(num)%2==0){           // (int)(Math.log10(num))+1
                total++;
            }
        }
        return total;
    }

    static int count(int num){
        int count=0;
        while(num>0){
            count++;
            num /=10;
        }
        return count;
    }

}
    