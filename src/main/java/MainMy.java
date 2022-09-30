import com.hw4.model.entity.Users;
import com.hw4.model.repository.UserRepository;
import com.hw4.model.repository.impl.UserRepositoryImpl;

public class MainMy {
    public static void main(String[] args) {
        Users user1 = new Users();
        user1.setLogin("Sergey");
        user1.setPassword("12345");

        Users users2 = new Users();
        users2.setLogin("Maksim");
        users2.setPassword("11111");

        UserRepository userRepository = new UserRepositoryImpl();
//        userRepository.save(users2);

        userRepository.remove(5);
        System.out.println(userRepository.findAll());
    }
}
