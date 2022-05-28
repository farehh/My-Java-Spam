/*
Java records were made as a data carrier classes. It objective is to simply contain data
and carry it between classes.

To create a such class you need to define its constructor, getter and setter methods.

*/


// This class containes an employee's data

public class Records {
    
    // Class attributes: class attributes are nothing but the variables
    // declared within the class
   
    private String firstname;
    private String lastname;
    private int Id;

    // Constructor of class with parameters.

    public Records(String firstname, String lastname, int Id){


        // The this keyword refers to the current object in a method or constructor.
        // this keyword is to eliminate the confusion between class attributes and parameters
        // with the same name (because a class attribute is shadowed by a method or constructor parameter)


        this.firstname = firstname;
        this.lastname = lastname;
        this.Id = Id;

    }
    
    // Setter and getter methods

    //Method 1

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    // Method 2

    public String getFirstname(){
        return firstname;

    }

    // Method 3
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    // Method 4

    public String getLastname(){
        return lastname;
    }

    // Method 5
    public void setId(int Id){
        this.Id = Id;
    }

    // Method 6

    public int getId(){
        return Id;
    }

    // Method 7
    public String toString(){
        // return the attributes
        return "Employee [firstName=" + firstname
        + ", lastName=" + lastname + ", Id=" + Id + "]";
    }
}
