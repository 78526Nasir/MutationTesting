package mutationtesting2;

/*
 #  IOD (Overrding Method Deletion)
*/

public class Thesis extends Proposal{
    
    private String innovation ;

    public Thesis(String title, String field, String objective,String innovation) {
        super(title, field, objective);
        this.innovation = innovation;
    }

    // Overriding Method Deletion Apply Here..
    
    /*
        @Override
        public void printAllInfo() {
            super.printAllInfo(); 
            System.out.println("Thesis Innovation: "+getThesisInnovation());
        }
    */
    
    public String getThesisInnovation(){
        return innovation;
    }

}
