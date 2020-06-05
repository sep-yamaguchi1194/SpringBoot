package com.example.demo.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
/**
 * User Information Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    /**
     * User Information Repository
     */
    @Autowired
    UserRepository userRepository;

    /**
     * User Information All Search
     * @return ユーザー情報検索結果
     */
    public List<User> searchAll() {
        return userRepository.findAll();
    }

    /**
     * User Information Add
     * @param user ユーザー情報
     */
    public void create(UserRequest userRequest) {
        Date now = new Date();

        User user = new User();
        user.setName(userRequest.getName());
        user.setAddress(userRequest.getAddress());
        user.setPhone(userRequest.getPhone());
        user.setCreateDate(now);
        user.setUpdateDate(now);
        userRepository.save(user);
    }
}
