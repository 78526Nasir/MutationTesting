package mutationtesting3;

/*
 # PCD (Type Cast Operator Deletion)
*/

public class Main {
    public static void main(String[] args) {

        Proposal projectProposal = new Project("ProjectABC", "CS", "Creating a NEW IDE for JAVA","New IDE ");
        Student student = new Student("Nasir Islam Sujan", "151-35-1102","Male");
        student.makeProposal(projectProposal);
        projectProposal.printAllInfo();
        
        Proposal thesisProposal = new Thesis("ThesisABC", "SWE","Thesis Objective", "Innovate A new Thesis Paper");
        Student student2 = new Student("Shah Alom", "151-35-1112","Male");
        student2.makeProposal(thesisProposal);
        
        thesisProposal.printAllInfo(); // Type Case Operator Deletion mutants apply here
    
    
    }

}
