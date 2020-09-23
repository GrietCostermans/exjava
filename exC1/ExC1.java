import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExC1 { 
        
        public static void main(String[] args) {

        Scanner readInput = new Scanner (System.in); 
        
        System.out.println("Please Input Title: " );
        String title = readInput.nextLine();
        System.out.println("Please Input Days: " );
        int days = Integer.parseInt(readInput.nextLine());
        System.out.println("Please Input Price: " );
        double price = Double.parseDouble(readInput.nextLine()) ;
        System.out.println("Please Input KnowLedge: " );
        boolean priorKnowledge = Boolean.parseBoolean(readInput.nextLine());

        ArrayList<String> instructorNames = new ArrayList<String>();
        instructorNames.add("Sandy");
        instructorNames.add("Candy");
        instructorNames.add("Mandy");

        printInfo(title, days, price, priorKnowledge);

        double totalPrice = 0;

        if ((days > 3) && (priorKnowledge == true)) {
            totalPrice = days * price;
            System.out.println("Total Price is without VAT: " + totalPrice);
        } else {
            totalPrice = days * price * 1.21;
            System.out.println("Total Price with VAT: " + totalPrice);    
        }

        if (totalPrice < 500) {
            System.out.println(totalPrice + " = CHEAP < 500");
        } else if ((totalPrice > 499) && (totalPrice < 1501 )) {
            System.out.println(totalPrice + " = OK betw 500-1500");
        } else {
            System.out.println(totalPrice + " = EXPENSIVE > 1500");
        }

    }
    public static void printInfo(String printTitle, int printDays, double printPrice, boolean printKnowledge ) {
        System.out.println("Title: " + printTitle);
        System.out.println("Days : " + printDays);
        System.out.println("Price: " + printPrice);
        System.out.println("Knowl: " + printKnowledge);
    }


    
}