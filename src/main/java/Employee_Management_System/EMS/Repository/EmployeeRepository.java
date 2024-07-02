package Employee_Management_System.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Employee_Management_System.EMS.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

    
} 
