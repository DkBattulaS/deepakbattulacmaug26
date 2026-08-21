import java.util.Scanner;

class sumproblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sumOfTwoNumber(sc);


        sc.close();
    }
    static void sumOfTwoNumber(Scanner sc) {
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of this numbers is:"+ sum);


    }
}