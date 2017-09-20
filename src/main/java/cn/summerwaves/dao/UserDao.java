package cn.summerwaves.dao;

import cn.summerwaves.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by summerwaves on 2017/9/11.
 */
@Repository
public interface UserDao {

    @Insert("INSERT INTO user(username,password,sex)VALUE (#{username},#{password},#{sex});")
    void insertUserByAnnotation(User user);

    @Select("SELECT * FROM  user")
    List<User> getAllUsers();

    @Select("SELECT * FROM  user where username = #{username}")
    User getUserByUserName(String username);

    @Delete("DELETE FROM user WHERE username = #{username}")
    void deleteUser(String username);

    @Update("UPDATE user SET password = #{password} WHERE username = #{username}" )
    void modifyPassword(User user);
}
