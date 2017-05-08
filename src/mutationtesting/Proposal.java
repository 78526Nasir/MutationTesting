package mutationtesting2;

/*
 # PPD (Parameter Varaiable Declaration with Child Class Type)
*/


public class Proposal {
    
    private String title;
    private String field;
    private String objective ;
    private Student student;

    public Proposal(String title, String field, String objective) {
        this.title = title;
        this.field = field;
        this.objective = objective;
        
    }
    
    public void setStudent(Person student){
        this.student=(Student)student; // PPD (Parameter Variables Declaration Apply Here)
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getField(){
        return field;
    }
    
    public String getObjective(){
        return objective;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void printAllInfo(){
        System.out.println("Proposal Info");
        System.out.println("Proposal Field : "+getField());
        System.out.println("Proposal Objective : "+getObjective());
        System.out.println("Studnet Info ");
        System.out.println("Student Name : "+student.getName());
        System.out.println("Student ID : "+student.getID());
        
    }
    
}
