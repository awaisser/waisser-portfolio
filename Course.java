//package CS170LAB10;

public class Course{
    // TODO: Declare private fields - courseNumber, courseTitle
        private String courseNumber;
        private String courseTitle;
    // TODO: Define mutator methods -
    //       setCourseNumber(), setCourseTitle()
     public void setCourseNumber (String userNumber) {
         courseNumber = userNumber;
     }
     public void setCourseTitle (String userTitle){
         courseTitle = userTitle;
     }

    // TODO: Define accessor methods -
    //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber() {
         return courseNumber;
    }
    public String getCourseTitle (){
         return courseTitle;
    }
    // TODO: Define printInfo()
    public void printInfo(){
         System.out.println("Course Information:");
         System.out.println("Course Number" + courseNumber);
         System.out.println("Course Title" + courseTitle);
    }
}
