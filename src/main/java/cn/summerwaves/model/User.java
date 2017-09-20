package cn.summerwaves.model;


import org.springframework.stereotype.Repository;

/**
 * Created by summerwaves on 2017/9/9.
 */
@Repository
public class User {

    public User() {

    }
    private String username;
    private String password;



    private String sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }


    public User(String username, String password, String sex) {
        this.username = username;
        this.password = password;
        this.sex = sex;
    }


}
