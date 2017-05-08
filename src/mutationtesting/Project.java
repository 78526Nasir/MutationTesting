package mutationtesting2;

/*
 # JTD (This Keyword Deletion)  
*/

public class Project extends Proposal{
    
    private String outcome ;
    
    public Project(String title, String field, String objective,String outcome) {
        super(title, field, objective);
        this.outcome = outcome;
    }

    @Override
    public void printAllInfo() {
        super.printAllInfo(); 
        System.out.println("Project Outcome : "+getProjectOutcome());
    }
    
    public String getProjectOutcome(){
        //return this.outcome; 
        return outcome; // JTD mutants apply here..
        
    }
    
    
    
    
}
