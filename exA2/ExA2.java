import java.util.ArrayList;
import java.util.List;

public class ExA2 { 
        
        public static void main(String[] args) {

        String title = "Griet haar cursus";
        int days = 5;
        double price = 500 ;
        boolean priorKnowledge = false;
        List<String> instructorName = new ArrayList<String>();
        instructorName.add("Sandy");
        instructorName.add("Candy");
        
        System.out.println("Title: " + title);
        System.out.println("Days : " + days);
        System.out.println("Price: " + price);
        System.out.println("Knowl: " + priorKnowledge);
        System.out.println("#instructors: " + instructorName.size());


    }

}