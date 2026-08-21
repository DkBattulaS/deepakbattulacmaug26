import java.util.Scanner;

class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        printMultiplicationTable(number);
        sc.close();
    }

    static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            //System.out.println("The Table is :");
            System.out.println(number + "*" + i + "=" + (number * i));

        }
       

    }
}