import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ExF1 {         
        public static void main(String[] args) {

            Course courseJava = new Course ("Java",5,500,false);
            courseJava.addInstructor("Joey");
            courseJava.addInstructor("Chandler");
            courseJava.printCourseData();

            Course courseCobol = new Course ("Cobol",1,1000,true);
            courseCobol.addInstructor("Phoebe");
            courseCobol.printCourseData();
            courseCobol.setCourseDayPrice(2000);
            courseCobol.printCourseData();

            Course courseSQL = new Course ("SQL",3,250,false);
            courseSQL.addInstructor("Monica");
            courseSQL.printCourseData();

            Course courseAgile = new Course ("Agile",5,10,false);
            courseAgile.printCourseData();
            courseJava.createTextFileWithCourseData();
            
        }
}
            