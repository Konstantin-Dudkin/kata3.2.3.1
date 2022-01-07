package testgroup.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testgroup.web.model.User;
import testgroup.web.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User getById(Integer id) {
        return userRepository.getById(id);
    }
}
