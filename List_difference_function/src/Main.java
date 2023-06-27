//importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        body();
    }
    
    public static void body() {
        try {
            Scanner myScanner = new Scanner(System.in);
            //Variable declaration and initialization
            int diff, item, x, listlength;
            System.out.println("Input list length");
            listlength = Integer.parseInt(myScanner.nextLine());

            //List creation with the length set to the user input
            List<Integer> thelist=new ArrayList<Integer>(listlength);

            //Loop used to enable user to input the numbers
            for(x=1;x<=listlength;x++){
                System.out.println("Input list item");
                item = Integer.parseInt(myScanner.nextLine());
                thelist.add(item);
            }

            //Sorting the list
            Collections.sort(thelist);
            diff = (thelist.get(thelist.size()-1)) - thelist.get(0);
            System.out.println("Maximum difference = "+diff);

    }
        //Catching the Number format exception
        catch (NumberFormatException e) {
            System.out.println("Invalid input, Please input an integer");
            //Recalling the function for the user to re-enter the input
            body();
        }
    }
}