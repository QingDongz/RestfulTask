package cn.summerwaves.service.imp;

import cn.summerwaves.dao.UserDao;
import cn.summerwaves.model.User;
import cn.summerwaves.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by summerwaves on 2017/9/11.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;

    @Override
    public void insertUser(User user) throws IOException {
        userDao.insertUserByAnnotation(user);
    }

    @Override
    public List<User> getAllUsers() throws IOException {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserByUserName(String username) throws IOException {
        return userDao.getUserByUserName(username);
    }

    @Override
    public void deleteUser(String username) {
        userDao.deleteUser(username);
    }

    @Override
    public void modifyPassword(User user)throws IOException {
        userDao.modifyPassword(user);
    }

}
