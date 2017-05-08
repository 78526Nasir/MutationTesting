package mutationtesting2;


/*
 # IHD (Hiding Varaible Deletion)
*/

public class Student extends Person{
    //original Code
    
    private String id;
    // private String name; IHD mutants apply here..
    
    // default constructor
    public Student() {
        super();
        System.out.println("Student object created without initialize it's property");
        
    }
    
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
