package higherordermutation1;


/*  
    @ Mutants on this Class:
    # PCI (Type Cast Operator Insertion)
    # PCD (Type Cast Operator Deletion)
*/

public class Main {
    public static void main(String[] args) {
        
        /*
         # PCI (Type Cast Operator Insertion)
         *   
        */
        
        Proposal projectProposal = new Project("ProjectABC", "CS", "Creating a NEW IDE for JAVA","New IDE ");
        Student student = new Student("Nasir Islam Sujan", "151-35-1102","Male");
        student.makeProposal(projectProposal);
        
        ((Project)projectProposal).printAllInfo(); // PCI mutants apply here

        
        /*
         # PCD (Type Cast Operator Deletion)
         *   
        */

        Proposal thesisProposal = new Thesis("ThesisABC", "SWE","Thesis Objective", "Innovate A new Thesis Paper");
        Student student2 = new Student("Shah Alom", "151-35-1112","Male");
        student2.makeProposal(thesisProposal);
        
        thesisProposal.printAllInfo(); // PCD mutants apply here

        
        
    }

}
