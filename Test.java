import java.util.Scanner;

public class Test{

public static void main(String[] args) {
        System.out.println("Test class started...\n");

        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        sc.close();
        sum = add(num1, num2);
        System.out.println("Sum of these numbers: "+sum);
    }

private static int add(int num1, int num2) {
    int sum;
    sum = num1 + num2;
    return sum;
}
}
