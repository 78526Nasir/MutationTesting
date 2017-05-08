package higherordermutation1;

/*
    @ Mutants on this Class:
    # IOD (Overrding Method Deletion)
    # IOP (Overriding Method Calling Position)
*/

public class Thesis extends Proposal{

    private String innovation ;

    public Thesis(String title, String field, String objective,String innovation) {
        super(title, field, objective);
        this.innovation = innovation;
    }

    /*
     # IOD (Overriding Method Deletion) Mutants
    */
    
    /*
    
    // IOD mutants apply here
    @Override
    public void printAllInfo() {
        super.printAllInfo(); 
        System.out.println("Thesis Innovation: "+getThesisInnovation());
    }
    
    */
    
    /*
     # IOP (Overriding Method Calling Position) Mutants
    */
    
    @Override
    public void printAllInfo() {
        System.out.println("Thesis Innovation: "+getThesisInnovation()); // IOP apply here..
        super.printAllInfo(); // IOP apply here..
    }
    

    public String getThesisInnovation(){
        return innovation;
    }
    
}
