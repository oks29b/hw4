import com.hw4.model.entity.Role;
import com.hw4.model.entity.Roles;
import com.hw4.model.entity.Users;
import com.hw4.model.repository.UserRepository;
import com.hw4.model.repository.impl.RolesRepositoryImpl;
import com.hw4.model.repository.impl.UserRepositoryImpl;

import java.util.HashSet;
import java.util.Set;

public class MainMy {
    public static void main(String[] args) {


        RolesRepositoryImpl roles =new RolesRepositoryImpl();

        UserRepository userRepository = new UserRepositoryImpl();
        
        Users user1 = new Users();

        user1 = userRepository.findById(5);
//        user1.setLogin("Vika");
//        user1.setPassword("12345");
        user1.setRoles(roles.findById(3));
        userRepository.save(user1);



    }
}
