package d2d.sncf.projetserveur.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import d2d.sncf.projetserveur.service.FileService;

@RestController
@RequestMapping("/api/users")
public class UserController {

      private final FileService fileService;

    public UserController(FileService fileService){
        this.fileService = fileService;

    }

    // @GetMapping("/{userId}")
    // public User getUserById(@PathVariable Long userId) {
    //     return userService.getUserById(userId);
    // }

    // @PostMapping("/create")
    // public User createUser(@RequestBody User user) {
    //     return userService.createUser(user);
    // }
}
