//https://leetcode.com/problems/two-sum/description/
package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums={2, 7, 11, 15};
        int target=9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

        sc.close();
    }
    static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length; i++){
            int sum=nums[i];
            for(int j=i+1; j<nums.length ; j++){
                sum+=nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }else{
                    sum=nums[i];
                }
            }
        }
        return res;
    }
}
    