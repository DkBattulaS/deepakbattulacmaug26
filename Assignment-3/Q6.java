import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int totalSum = calculateSum(n);

        System.out.println("The sum of numbers from 1 to " + n + " is: " + totalSum);

        sc.close();
    }

    public static int calculateSum(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i; // sum = sum + i
        }

        return sum;
    }
}