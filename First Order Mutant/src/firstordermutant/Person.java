package mutationtesting3;


/*
    # JDC (Java Supported Default Construction Deletion)
*/

public class Person {
    // Original Code
    private String name;
    private String gender;

    // JDC mutants apply here..
    /*
        public Person() {
            System.out.println("Person object created without initialize it's property");
        }
    */
    
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    
    public void printAllInfo(){ 
        System.out.println("Name : "+getName());
        System.out.println("Gender : "+getGender());
    }
    

}