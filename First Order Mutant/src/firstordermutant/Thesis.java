package mutationtesting3;

/*
 # IOP (Overriding Method Calling Position)
*/

public class Thesis extends Proposal{
    private String innovation ;

    public Thesis(String title, String field, String objective,String innovation) {
        super(title, field, objective);
        this.innovation = innovation;
    }

    @Override
    public void printAllInfo() {
//        super.printAllInfo(); // -> first call
//        System.out.println("Thesis Innovation: "+getThesisInnovation()); // -> second call
        System.out.println("Thesis Innovation : "+getThesisInnovation());
        super.printAllInfo();
    }
    
    public String getThesisInnovation(){
        return innovation;
    }

}
