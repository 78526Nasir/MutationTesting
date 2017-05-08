package mutationtesting2;

/*
 # AMC (Access Modifier Change)
*/

public class Person {
    
    // Original Code
    public String name; // AMC mutants apply here..
    private String gender;

    public Person() {
        // default constructor
        System.out.println("Person object created without initialize it's property");
    }
    
    
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



