import java.util.Scanner;
class Positivenumber{
    public static void main(String args[]){
        askForPositiveNumber();

    }
    static void askForPositiveNumber(){
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        
        while (number<=0) {
            System.out.println("Enter positive number! ");
            number = sc.nextInt();
        }
        System.out.println("your  number: "+number);
        
         sc.close();

    }
}