import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExC5 { 
        
        public static void main(String[] args) {

        Scanner readInput = new Scanner (System.in); 
        
        System.out.println("Please Input Title: " );
        String title = readInput.nextLine();
        int days=0;
        double price=0;
        boolean priorKnowledge=false;

        try {
               
            System.out.println("Please Input Days: " );
            days = Integer.parseInt(readInput.nextLine());
            System.out.println("Please Input Price: " );
            price = Double.parseDouble(readInput.nextLine()) ;
            System.out.println("Please Input KnowLedge: " );
            priorKnowledge = Boolean.parseBoolean(readInput.nextLine());

        } catch (NumberFormatException e) {
                System.out.println("U hebt u kans verkeken - bye" );
                System.exit(-1);
        }

        ArrayList<String> instructorNames = new ArrayList<String>();
        instructorNames.add("Sandy");
        instructorNames.add("Candy");
        instructorNames.add("Mandy");

        double totalPrice = 0;

        totalPrice = totalPrice(days,price,priorKnowledge);
        
        printInfo(title, days, price, priorKnowledge,totalPrice);
    }

    public static void printInfo(String printTitle, int printDays, double printPrice, boolean printKnowledge, double printTotalPrice ) {
        System.out.println("================= INFO COURSE =====================");
        System.out.println("Title: " + printTitle);
        System.out.println("Days : " + printDays);
        System.out.println("Price: " + printPrice);
        System.out.println("Knowl: " + printKnowledge);
        System.out.println("TotalPrice: " + printTotalPrice);
        
        if (printTotalPrice < 500) {
            System.out.println(printTotalPrice + " = CHEAP < 500");
        } else if ((printTotalPrice > 499) && (printTotalPrice < 1501 )) {
            System.out.println(printTotalPrice + " = OK betw 500-1500");
        } else {
            System.out.println(printTotalPrice + " = EXPENSIVE > 1500");
        }
    }

    public static double totalPrice(int totalDays, double totalPriceDay, boolean totalPriorKnowledge ) {
        double totalPriceReturn = totalDays * totalPriceDay; 

        if (!(totalDays > 3) && (totalPriorKnowledge)) {
            totalPriceReturn*=1.21;
        }

        return totalPriceReturn;
    }
    
}