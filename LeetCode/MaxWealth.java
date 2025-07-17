//https://leetcode.com/problems/richest-customer-wealth/
package LeetCode;

import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] accounts={{1,2,3},{3,2,1,5}};
        System.out.println(maximumWealth(accounts));
        sc.close();
    }

    static int maximumWealth(int[][] accounts){
        int res = Integer.MIN_VALUE;
        for(int[] acc:accounts){
            int sum=0;
            for(int n:acc){
                sum+=n;
            }
            if(sum>res){
                res=sum;
            }
        }
        return res;


    }
}
    