package cn.zt.springboot.javaconfig;

/**
 * @Desciption:
 * @Author: zhaotong
 * @Date: 2019/1/3 12:04 PM
 */
public class User {

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String username;

    private String password;

    private Integer age;

}
