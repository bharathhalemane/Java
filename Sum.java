import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a, b;

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();


        System.out.println(sum(a,b));
    }

    static int sum(int a, int b){
        return a+b;
    }
}
