public class Course {         
    private String courseTitle;
    private int courseDays;
    private double courseDayPrice;
    private boolean coursePriorKnowledge;

    
    // insert van het course-object
    public Course (String courseTitle, int courseDays, double courseDayPrice, boolean coursePriorKnowledge) {
        this.courseTitle = courseTitle;
        this.courseDays = courseDays;
        this.courseDayPrice = courseDayPrice;
        this.coursePriorKnowledge = coursePriorKnowledge;
    }

    // getters (reads) & setters (updates)
    public String getCourseTitle() {
        return courseTitle;
    } 

    public int getCourseDays() {
        return courseDays;        
    }

    public double getCourseDayPrice() {
        return courseDayPrice;
    }

    public boolean getCoursePriorKnowledge() {
        return coursePriorKnowledge;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseDays(int courseDays) {
        this.courseDays = courseDays;
    }

    public void setCourseDayPrice(double courseDayPrice) {
        this.courseDayPrice = courseDayPrice;
    }

    public void setCoursePriorKnowledge(boolean coursePriorKnowledge) {
        this.coursePriorKnowledge = coursePriorKnowledge;
    }

    public void printCourseData() {
        System.out.println("============COURSE-DATA===========");
        System.out.println("Title : " + getCourseTitle());
        System.out.println("#Days : " + getCourseDays());
        System.out.println("Price/Day : " + getCourseDayPrice());
        System.out.println("Prior Know: " + getCoursePriorKnowledge());
    }

    public double calculateTotalPrice() {
        return this.courseDays*this.courseDayPrice;
    }

}    
