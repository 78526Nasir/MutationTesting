package mutationtesting3;

/*
 # IHI (Hiding Varaible Insertion)
*/

public class Student extends Person{
    
    private String id;
    private String name; // IHI mutants apply here..
    
    public Student(String name, String id, String gender) {
        super(name, gender);
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    @Override
    public void printAllInfo() {
        super.printAllInfo(); 
        System.out.println("ID : "+getID());
    }
    
    
    
    public void makeProposal(Proposal proposal){
        proposal.setStudent(this);
        System.out.println("Your Proposal Has Been Submitted ");
        
    }
    
}
