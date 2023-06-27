package org.example.dao;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.utils.request.UserForm.RegisterUserForm;

public interface UserDao {
    String getPasswordByUsername(String username);
    boolean saveUser(RegisterUserForm registerUserForm);
    boolean checkUserExistByUsername(String username);

    User getUserByUsername(String username);

    User getUserById(Long id);

    boolean updateUser(User user);
}
