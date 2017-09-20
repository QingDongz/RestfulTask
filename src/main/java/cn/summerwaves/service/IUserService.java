package cn.summerwaves.service;

import cn.summerwaves.model.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by summerwaves on 2017/9/11.
 */
public interface IUserService {
    void insertUser(User user) throws IOException;
    List<User> getAllUsers() throws IOException;
    User getUserByUserName(String username) throws IOException;
    void deleteUser(String username) throws IOException;
    void modifyPassword(User user)throws IOException;
}
