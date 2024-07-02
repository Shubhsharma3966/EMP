package Employee_Management_System.EMS.Serivces;

import org.springframework.security.core.userdetails.UserDetailsService;

import Employee_Management_System.EMS.DTO.UserRegistrationDto;
import Employee_Management_System.EMS.Model.User;

public interface UserService extends UserDetailsService{

    User save(UserRegistrationDto registrationDto);
    
}
