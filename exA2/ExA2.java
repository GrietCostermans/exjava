import java.util.ArrayList;
import java.util.List;

public class ExA2 { 
        
        public static void main(String[] args) {

        String title = "Griet haar cursus";
        int days = 5;
        double price = 500 ;
        boolean priorKnowledge = false;
        List<String> instructorNames = new ArrayList<String>();
        instructorNames.add("Sandy");
        instructorNames.add("Candy");
        
        System.out.println("Title: " + title);
        System.out.println("Days : " + days);
        System.out.println("Price: " + price);
        System.out.println("Knowl: " + priorKnowledge);
        System.out.println("#instructors: " + instructorNames.size());


    }

}