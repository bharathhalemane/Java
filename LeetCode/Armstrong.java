package LeetCode;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to know: ");
        int a = sc.nextInt();

        System.out.println(isArmstrong(a));

        sc.close();
    }


    static boolean isArmstrong(int n){
        int original = n;
        int sum  = 0;

        while(n > 0){
            int rem = n %10;
            n = n/10;
            sum += (int) Math.pow(rem,3);
        }
        return sum == original;
    }
}
    