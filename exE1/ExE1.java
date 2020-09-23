import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ExE1 {         
        public static void main(String[] args) {

        Scanner readInput = new Scanner (System.in); 
        
        System.out.println("Instructors First Name: " );
        String instructorFirstName  = readInput.nextLine();
        System.out.println("Instructors Last Name: " );
        String instructorLastName  = readInput.nextLine();
        System.out.println("Instructors Age: " );
        int instructorAge  = Integer.parseInt(readInput.nextLine());
        System.out.println("Instructors Starting Age @ ABIS: " );
        int instructorStartAge  = Integer.parseInt(readInput.nextLine());
        System.out.println("Instructors Starting Salary @ ABIS: " );
        double instructorStartSalary  = Double.parseDouble(readInput.nextLine());
        
        printSalaryHistory(instructorFirstName,instructorLastName,instructorAge,instructorStartAge,instructorStartSalary);
                
        }

        public static void printSalaryHistory(String printFirstName , String printLastName, int printAge, int printStartAge, double printStartSalary) {
        
        double calculSalary = printStartSalary;

        for (int i=printStartAge;i<printStartAge+35;i=i+5)
         {   System.out.println("Salary of "+printFirstName+" "+printLastName+" at "+i+ " is "+calculSalary ); 
             calculSalary *= 1.03;
         }    

         System.out.println("Maximum salary reached");
        }
     
}