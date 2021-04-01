package by.nagula.insuranse_domain.service;

import by.nagula.insuranse_domain.entity.User;

public interface UserService {
    void save(User user);
    User getUser(String firstName, String lastName);

}
