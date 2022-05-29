// Simple record example that demonstrates that you do not need to set constructor,
// getter and setter method. It also does not need hashcode() and toString() method.
// record cannot extend other classes. The clas is marked final.  



public record EmployeeRecord (
    Long id,
    String firstname,
    String lastname,
    String email,
    int age
){
    
}
