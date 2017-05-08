package mutationtesting2;

/*  
    # PCI (Type Cast Operator Insertion)
*/


public class Main {
    public static void main(String[] args) {
             
        Proposal projectProposal = new Project("ProjectABC", "CS", "Creating a NEW IDE for JAVA","New IDE ");
        Student student = new Student("Nasir Islam Sujan", "151-35-1102","Male");
        student.makeProposal(projectProposal);
        
        ((Project)projectProposal).printAllInfo(); // PCI mutants apply here
        
        
        
        Proposal thesisProposal = new Thesis("ThesisABC", "SWE","Thesis Objective", "Innovate A new Thesis Paper");
        Student student2 = new Student("Shah Alom", "151-35-1112","Male");
        student2.makeProposal(thesisProposal);
        ((Thesis)thesisProposal).printAllInfo();
        
    }

}
