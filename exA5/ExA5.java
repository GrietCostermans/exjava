import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExA5 { 
        
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

        double totalPrice = days * price * 1.21; 
        System.out.println("Total Price: " + totalPrice);
    }

}