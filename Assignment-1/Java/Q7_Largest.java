
class Largest {
    public static void main(String Dk[]) {
        int num1 = 98, num2 = 87, num3 = 94;

        if (num1 > num2 && num1 > num3) {

            System.out.println("Largest Number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest Number is " + num2);

        } else {
            System.out.println("Largest Number is " + num3);
        }

    }

}