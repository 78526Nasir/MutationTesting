package higherordermutation1;

/*
    @ Mutants on this Class:
    # IHI (Hiding Varaible Insertion)
    # ISD (Super Keyword Deletion)
    # IPC (Explicit Call of Parent's constructor)    
*/

public class Student extends Person{
   
    private String id;
    
    /*
     # IHI (Hiding Variable Insertion) mutants
    */
    
    private String name; // IHI mutants apply here..
    
    /*
     # IPC (Explicit call of Parent's Constructor) Mutant
    */
    
    
    public Student() {
//        super();  // IPC mutants apply here by comment outing the explicit call of Parent's constructor
        System.out.println("Student object created without initialize it's property");
        
    }
    public Student(String name, String id, String gender) {
        super(name, gender);
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    

    public void printAllInfo() {
        // super.printAllInfo();  by applying IOR mutants on 'Person' class, this line generate comile time Error
        System.out.println("ID : "+getID());
    }
    
    /*
     # ISI (Super Keyword Deletion) Mutant
    */
    
    @Override
    public void printPersonInfo() {
        printPersonInfo();  // ISI mutants apply here by deleting the super keyword..
        System.out.println("ID : "+getID());
    }
    
    
    public void makeProposal(Proposal proposal){
        proposal.setStudent(this);
        System.out.println("Your Proposal Has Been Submitted ");
        
    }


        

    
    
}
