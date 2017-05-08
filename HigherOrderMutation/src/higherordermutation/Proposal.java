package higherordermutation1;

/*
    @ Mutants on this Class:
    # PPD (Parameter Varaiable Declaration with Child Class Type)
    # JSI (Static Modifier Insertion)
    # AMC (Accessor Modifier Change)
       
*/

public class Proposal {
    
    /*
     # AMC (Accessor Modifier Change)
    */
    public String title; // AMC mutants Apply here..
    
    private String field;
    private String objective ;
    
    /*
     # JSI (Static Modifier Insertion)
    */
    private static Student student; // JSI mutants apply here..

    public Proposal(String title, String field, String objective) {
        this.title = title;
        this.field = field;
        this.objective = objective;
        
    }
    
    /*
     # PPD (Parameter Varaiable Declaration With Child class Type) mutants
    */
    
    public void setStudent(Person student){ // PPD mutants apply here..
        this.student=(Student)student;
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


