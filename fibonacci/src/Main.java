//importing Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaration of body function
        body();
    }

    public static void body() {
        //Definition of body function
        //Use try-catch block for taking input from the user and handling exception
        try {
            Scanner myScanner = new Scanner(System.in);
            //Variable declaration and initialization
            int num1 = 0, num2 = 1, num3, x, limit;
            System.out.println("Input number");
            limit = Integer.parseInt(myScanner.nextLine());

            //Exception handling for the zero or negative integer input case
            if(limit <= 0){
                System.out.println("Please input a positive integer");
                body();
            }

            System.out.print(num1+" "+num2);
            for(x=2; x<limit; x++){
                num3=num1+num2;
                if(num3<=limit){
                    System.out.print(" "+num3);
                    num1=num2;
                    num2=num3;
                }
            }
        }
        //Catching the Number format exception
        catch (NumberFormatException e) {
            System.out.println("Invalid input, Please input an integer");
            //Recalling the function for the user to re-enter the input
            body();
        }
    }
}