package org.example.dao.daoImpl;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.example.entity.UserAuth;
import org.example.repository.UserAuthRepository;
import org.example.repository.UserRepository;
import org.example.utils.request.UserForm.RegisterUserForm;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    private final UserRepository userRepository;
    private final UserAuthRepository userAuthRepository;

    public UserDaoImpl(UserRepository userRepository, UserAuthRepository userAuthRepository) {
        this.userRepository = userRepository;
        this.userAuthRepository = userAuthRepository;
    }

    @Override
    public String getPasswordByUsername(String username) {
        User user = userRepository.getUserByUsername(username);
        if(user == null) return null;
        return userRepository.getUserByUsername(username).getUserAuth().getPassword();
    }

    @Override
    public boolean checkUserExistByUsername(String username) {
        return userRepository.getUserByUsername(username) != null;
    }

    @Override
    public boolean saveUser(RegisterUserForm registerUserForm) {
        if(checkUserExistByUsername(registerUserForm.getUsername())) return false;

        User user = new User();
        user.setUsername(registerUserForm.getUsername());
        user.setEmail(registerUserForm.getEmail());
        user.setPhone(registerUserForm.getPhone());
        user.setName(registerUserForm.getName());
        user.setAvatar(registerUserForm.getAvatar());

        UserAuth userAuth = new UserAuth();
        userAuth.setUsername(registerUserForm.getUsername());
        userAuth.setPassword(registerUserForm.getPassword());
        userAuth.setUser(user);
        user.setUserAuth(userAuth);

        userRepository.save(user);
        userAuthRepository.save(userAuth);
        return true;
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User getUserById(Long id){
        return userRepository.getUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        User userInDB = userRepository.getUserById(user.getId());
        if(userInDB == null) return false;
        userInDB.setName(user.getName());
        userInDB.setAvatar(user.getAvatar());
        userInDB.setEmail(user.getEmail());
        userInDB.setPhone(user.getPhone());
        userInDB.setDescription(user.getDescription());
        userRepository.save(userInDB);
        return true;
    }
}
