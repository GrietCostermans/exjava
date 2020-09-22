import java.util.Scanner;

public class ExB4 { 
        
        public static void main(String[] args) {

        Scanner readInput = new Scanner (System.in); 
        
        System.out.println("Choose your language NL/FR/EN" );
        String choosenLanguage = readInput.nextLine();
        
        switch (choosenLanguage) {
            case "NL": System.out.println("Hallowkes"); break;
            case "FR": System.out.println("Bonjour"); break;
            case "EN": System.out.println("Hello"); break;
            default : System.out.println("Hallowkes/Bonjour/Hello"); break; 
        }

    }

}