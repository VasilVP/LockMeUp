package com.project.ServiceImpl;

import com.project.Repositories.UserRepository;
import com.project.Services.UserService;
import com.project.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public void save(User user) {
        this.userRepository.saveAndFlush(user);
    }
}
