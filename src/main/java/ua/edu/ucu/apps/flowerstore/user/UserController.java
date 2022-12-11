package ua.edu.ucu.apps.flowerstore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="user")
@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    UserController (UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<MyUser> getUsers(){
        return userService.getUsers();
    }
    @PostMapping
    public void addUser(@RequestBody MyUser user) {
        userService.addUser(user);
    }
}
