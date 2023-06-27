package org.example.service;

import org.example.entity.User;
import org.example.utils.request.UserForm.RegisterUserForm;

public interface UserService {
    User login(String username, String password);

    boolean register(RegisterUserForm registerUserForm);

    User getUserById(Long id);

    boolean updateUser(User user);
}
