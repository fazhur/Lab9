package ua.edu.ucu.apps.flowerstore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    private static UserRepository userRepository;
    @Autowired
    UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<MyUser> getUsers() {
        MyUser user1 = new MyUser();
        MyUser user2 = new MyUser(2, "test@gmail.com", LocalDate.parse("2004-09-06"), 18);
        MyUser user3 = new MyUser(3, "bohdan@gmail.com", LocalDate.parse("2003-11-13"), 19);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        return userRepository.findAll();
    }
    public void addUser(MyUser user) {
        if (!userRepository.findMyUserByEmail(user.getEmail()).isPresent()) {
            userRepository.save(user);
        }
    }

}
