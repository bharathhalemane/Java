package LeetCode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Enter a value: ");
        x =sc.nextInt();

        int xReference = x;
        int y = 0;
        while(x>0){
            y =(y+x%10)*10;
            System.out.println("++"+y);
            x = x / 10;
            System.out.println("--"+x);
        }
        System.out.println(xReference == y / 10);








        sc.close();
    }
}
    