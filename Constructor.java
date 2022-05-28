// Understand what is a constructor?

/*
A constrcutor is a special method that is used to initialize objects. The constructor
is called when an object of a class is created. It can be used to set intial values 
for object attributes.


A constructor must match the class name and it cannot have a return type like void.

All classes have contructors by default. If you do not create one, java creates it 
for you. But you are not able to set initial values for object attributes.


*/


public class Constructor{
    int x;  // Create a class attribute

    public Constructor(){
        x = 5;  // Set initial value for the class attribute x

    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(); // Create object of class.
        System.out.println(myObj.x);
    }

}