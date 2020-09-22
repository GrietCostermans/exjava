import java.util.ArrayList;
import java.util.List;

public class ExB3 { 
        
        public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(20);
        integerList.add(50);
        integerList.add(100);
        integerList.add(40);

        System.out.println("size: " + integerList.size());
        /*
        double sumIntegerList = 0;
        
        for (int i=0;i<integerList.size();i++) {
            sumIntegerList = (integerList.get(i) + sumIntegerList);
            System.out.println("sumIntegerList : " + sumIntegerList );     
        }
        */
        /* for each loop voorbeeld Sandy
        	int[] numbers = {3,5,6,8,10};
		
		double total = 0;
		for (int val : numbers){
			total+=val;
		}
        double average = total/numbers.length;
		System.out.println("The average is: " + average);
		*/
        
        double sumIntegerList = 0;
        for (int eachValueOfIntegerlist : integerList ) {
             sumIntegerList+=eachValueOfIntegerlist;
        }
        System.out.println("Average of "+sumIntegerList+ " / "+integerList.size()+ " = " + (sumIntegerList/integerList.size()) );

        }

}