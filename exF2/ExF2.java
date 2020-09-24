public class ExF2 {         
        public static void main(String[] args) {

            Instructor ins1 = new Instructor ("Joey","Tribbiani",42,20,2000);
            ins1.printInstructorData();
            Instructor ins2 = new Instructor ("Phoebe","Buffay",65,25,5000);
            ins2.printInstructorData();
            Instructor ins3 = new Instructor ("Ursula","Buffay",65,60,5000);
            ins3.printInstructorData();
            ins3.printInstructorSalaryIncrease();
            ins3.setInstructorStartAge(21);
            ins3.printInstructorData();
            ins3.printInstructorSalaryIncrease();
        }
}
            