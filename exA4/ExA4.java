import java.util.ArrayList;
import java.util.List;

public class ExA4 { 
        
        public static void main(String[] args) {

        // java ExA4 Griet 5 100 true
    
        String title = args[0];
        int days = Integer.parseInt(args[1]);
        double price = Double.parseDouble(args[2]) ;
        boolean priorKnowledge = Boolean.parseBoolean(args[3]);
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