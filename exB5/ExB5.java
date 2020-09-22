import java.util.Scanner;
import java.io.*;

public class ExB5 { 
        
        public static void main(String[] args) {

        Scanner readInput = new Scanner (System.in); 
        
        String choosenWelkom = "J";

        do {
            System.out.println("Welkom!" );
            System.out.println("Nog eens welkom zeggen? J/N" );
            choosenWelkom = readInput.nextLine().toUpperCase();
            //System.out.println(choosenWelkom);
        } while (choosenWelkom.equals("J"));
    }

}