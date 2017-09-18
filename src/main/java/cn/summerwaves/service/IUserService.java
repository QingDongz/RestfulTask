package cn.summerwaves.service;

import cn.summerwaves.model.User;

import java.io.IOException;

/**
 * Created by summerwaves on 2017/9/11.
 */
public interface IUserService {
    public void insertUser(User user) throws IOException;
}
