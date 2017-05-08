package higherordermutation1;

/*
    @ Mutants on this Class:
    # JTI (This Keyword Insertion)
    # OAC (Arguments of Overloading Method Change)
*/

public class Project extends Proposal{
    
    /*
     # JTI (This Keyword Insertion) mutants
    */

    private String outcome ;

    public Project(String title, String field, String objective,String outcome) {
        super(title, field, objective);
        this.outcome = this.outcome; // JTI mutants apply here..
    }

    /*
     # OAC (Arguments of Overloading Methods Change)
    */
    
    public Project(String title, String field, String objective) {
        super(title, field, objective); // OAC mutant apply here..
    }  

    @Override
    public void printAllInfo() {
        super.printAllInfo(); 
        System.out.println("Project Outcome : "+getProjectOutcome());
    }
    
    public String getProjectOutcome(){
        return outcome;
    }     
    
    
}
