import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExA6 { 
        
        public static void main(String[] args) {

        HashMap<String, Integer> daysInMonth = new HashMap<String,Integer >();
        daysInMonth.put("JAN",31);
        daysInMonth.put("FEB",28);
        daysInMonth.put("MAR",31);
        daysInMonth.put("APR",30);
        daysInMonth.put("MAY",31);
        daysInMonth.put("JUN",30);
        daysInMonth.put("JUL",31);
        daysInMonth.put("AUG",31);
        daysInMonth.put("SEP",30);
        daysInMonth.put("OCT",31);
        daysInMonth.put("NOV",30);
        daysInMonth.put("DEC",31);


        Scanner readInput = new Scanner (System.in); 
        
        System.out.println("Please input the Day Number : " );
        int dayNumberInput = Integer.parseInt(readInput.nextLine());
        System.out.println("Please Input the Month (3chars) : " );
        String monthInput = readInput.nextLine() ;
        //System.out.println(daysInMonth.get(monthInput));

        int calculDate = daysInMonth.get(monthInput);
        System.out.println("Days until EOM : " + (calculDate-dayNumberInput));
        
 
    }

}