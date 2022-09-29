import com.hw4.model.entity.Users;
import com.hw4.model.repository.UserRepository;
import com.hw4.model.repository.impl.UserRepositoryImpl;

public class MainMy {
    public static void main(String[] args) {
        Users users = new Users();
        users.setLogin("Sergey");
        users.setPassword("12345");

        UserRepository userRepository = new UserRepositoryImpl();
//        userRepository.save(users);

        userRepository.removeById(2);
        System.out.println(userRepository.findAll());
    }
}
