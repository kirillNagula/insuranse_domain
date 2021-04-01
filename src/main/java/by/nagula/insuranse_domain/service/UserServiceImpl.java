package by.nagula.insuranse_domain.service;

import by.nagula.insuranse_domain.entity.User;
import by.nagula.insuranse_domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(String firstName, String lastName) {
        if (userRepository.findByFirstNameAndLastName(firstName, lastName).isPresent()) {
            return userRepository.findByFirstNameAndLastName(firstName, lastName).get();
        }
        return null;
    }
}
