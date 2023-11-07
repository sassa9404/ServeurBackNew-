package d2d.sncf.projetserveur.service;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import d2d.sncf.projetserveur.repository.FileRepository;
import d2d.sncf.projetserveur.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

      public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    // public User getUserById(Long userId) {
    //     return userRepository.findById(userId)
    //             .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
    // }

    // public User createUser(User user) {
    //     return userRepository.save(user);
    // }
}

