package Employee_Management_System.EMS.Model;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users" , uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ; 

    @Column(name="first name")
    private String firstname;

    @Column(name="last name")
    private String lastname;

    private String email ;    
    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(
            name = "user_id" , referencedColumnName = "id" ),
        inverseJoinColumns = @JoinColumn(
            name = "role_id", referencedColumnName = "id")
            )
    private Collection<Role> roles;

    public User(String firstName, String lastName, String email, String password, List<Role> roles) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;   
    }

    //Getter and Setter
}
