//package CS170LAB10;

public class OfferedCourse extends Course {
    // TODO: Declare private fields - instructorName, term, classTime
        private String instructorName;
        private String term;
        private String classTime;
    // TODO: Define mutator methods -
    //      setInstructorName(), setTerm(), setClassTime()
    public void setInstructorName (String userIN){
     instructorName=userIN;
    }
    public void setTerm (String userT){
     term=userT;
    }
    public void setClassTime (String userCT){
     classTime=userCT;
    }
    // TODO: Define accessor methods -
    //      getInstructorName(), getTerm(), getClassTime()
    public String getInstructorName(){
        return instructorName;
    }
    public String getTerm(){
        return term;
    }
    public String getClassTime(){
        return classTime;
    }
}
