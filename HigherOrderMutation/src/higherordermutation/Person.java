package higherordermutation1;

/*
    @ Mutants on this Class:
    # Accessor Modifier Change
    # IOR (Overriding Method Rename)
    //JTD (This Keyword Deletion)
*/

public class Person { 

    
    public Person() {
        System.out.println("Person object created without initialize it's property");
    }

    /*
     # AMC (Accessor Modifier Change)
    */
    public String name; // appling AMC mutants
    protected String gender; // appling AMC mutants

    /*
     # JTD (This Keyword Deletion)
    */
    
    public Person(String name, String gender) {
        name = name; // JTD mutans apply here
        gender = gender; // JTD mutans apply here
    }
    
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    
      
    /*
     # IOR (Overriding Method Rename) mutants
     *   
    */
    
    public void printPersonInfo(){ // applying IOR mutants
        System.out.println("Name : "+getName());
        System.out.println("Gender : "+getGender());
    }
    
}
