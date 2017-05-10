package mutationtesting3;

/*
    PRV (Reference Assignment With Other Compatible Type)
*/

public class Proposal {
    
    private String title;
    private String field;
    private String objective ;
    private Object student; // PRV mutants apply here..

    public Proposal(String title, String field, String objective) {
        this.title = title;
        this.field = field;
        this.objective = objective;
        
    }
    
    public void setStudent(Student student){
        this.student=student;
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
        return (Student)student; // Casting the 'Object' Reference into 'Student' Reference
    }
    
    public void printAllInfo(){
        System.out.println("Proposal Info");
        System.out.println("Proposal Field : "+getField());
        System.out.println("Proposal Objective : "+getObjective());
        System.out.println("Studnet Info ");
        System.out.println("Student Name : "+((Student)student).getName()); // Casting the 'Object' Reference into 'Student' Reference
        System.out.println("Student ID : "+((Student)student).getID());     // Casting the 'Object' Reference into 'Student' Reference
        
    }
    
}
