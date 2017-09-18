package cn.summerwaves.service.imp;

import cn.summerwaves.mapper.UserMapper;
import cn.summerwaves.model.User;
import cn.summerwaves.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by summerwaves on 2017/9/11.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) throws IOException {
        userMapper.insertUserByAnnotation(user);
    }

}
