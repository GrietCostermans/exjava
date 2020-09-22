import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExB1 { 
        
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
               
        System.out.println("Title: " + title);
        System.out.println("Days : " + days);
        System.out.println("Price: " + price);
        System.out.println("Knowl: " + priorKnowledge);
        System.out.println("#instructors: " + instructorNames.size());


        if ((days > 3) & (priorKnowledge == true)) {
            System.out.println("Total Price is without VAT: " + (days * price * 1.21));
        } else {
            System.out.println("Total Price with VAT: " + (days * price * 1.21));    
        }
    }
}