import java.util.Scanner;

class Agechecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AGE: ");
        int age = sc.nextInt();
        checkAgeCategory(age);
          sc.close();
    }

    static void checkAgeCategory(int age) {

        if (age >= 18 && age <= 59) {
            System.out.println("You are Adult bro");
        } else if (age >= 60 && age <= 100) {
            System.out.println("You are Senior Citizen ");
        } else if (age <= 17 && age >= 1) {
            System.out.println("You are Minor buddy");
        } else {
            System.out.println("Enter valid age");
        }
      
    }
}