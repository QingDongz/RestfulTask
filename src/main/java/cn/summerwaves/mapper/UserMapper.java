package cn.summerwaves.mapper;

import cn.summerwaves.model.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by summerwaves on 2017/9/11.
 */
public interface UserMapper {

    @Insert("INSERT INTO user(user_name,password,sex)VALUE (#{username},#{password},#{sex});")
    void insertUserByAnnotation(User user);

}
