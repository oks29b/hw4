import com.hw4.model.entity.Role;
import com.hw4.model.entity.Roles;
import com.hw4.model.entity.Users;
import com.hw4.model.repository.UserRepository;
import com.hw4.model.repository.impl.RolesRepositoryImpl;
import com.hw4.model.repository.impl.UserRepositoryImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainMy {
    public static void main(String[] args) {


        RolesRepositoryImpl roles =new RolesRepositoryImpl();

        UserRepository userRepository = new UserRepositoryImpl();

//        Roles roles12 = new Roles();
//        Roles roles13 =new Roles();
//        Roles roles14 = new Roles();
//        roles12.setRoles(Role.PASSENGER);
//        roles13.setRoles(Role.EMPLOYEE);
//        roles14.setRoles(Role.USER);

//        roles.save(roles12);
//        roles.save(roles13);
//        roles.save(roles14);

//        Set<Roles> set = new HashSet<>();
//        set.add(roles.findById(1));
//        set.add(roles.findById(2));
//        set.add(roles.findById(3));
//
//        Users user1 = Users.builder()
//                .login("Vika")
//                .password("466")
//                .roles(set)
//                .build();
//
        userRepository.remove(12);


//        System.out.println(userRepository.findAll());



//        Users users = userRepository.findById(1);
//        System.out.println(users);



//        user1 = userRepository.findById(5);
////        user1.setLogin("Vika");
////        user1.setPassword("12345");
//        user1.setRoles(roles.findById(3));
//        userRepository.save(user1);
//        System.out.println(roles.findById(1));



    }
}
