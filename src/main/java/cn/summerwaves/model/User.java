package cn.summerwaves.model;


/**
 * Created by summerwaves on 2017/9/9.
 */

public class User {

    public User() {

    }
    private String username;
    private String password;
    private int sex;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
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


    public User(String username, String password, int sex) {
        this.username = username;
        this.password = password;
        this.sex = sex;
    }


}
