package Employee_Management_System.EMS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ; 
    
    @Column(name = "first name")
    private String firstname;

    @Column(name = "last name")
    private String lastname;

    @Column(name = "email")
    private String email;
    
    //getter and setter
}
