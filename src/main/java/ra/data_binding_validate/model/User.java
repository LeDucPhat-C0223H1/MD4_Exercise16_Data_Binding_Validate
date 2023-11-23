package ra.data_binding_validate.model;

import java.util.Date;

public class User {
    private Long id;
    private String
            username,
            password,
            avatar = "https://tse1.mm.bing.net/th?id=OIP.kgHfR7QfLo7eslChOTycpwHaFj&pid=Api&P=0&h=220",
            fullName;
    private Date birthday;
    private boolean status;

    public User() {
    }

    public User(Long id, String username, String password, String fullName, Date birthday, boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.birthday = birthday;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User(Long id, String username, String password, String avatar, String fullName, Date birthday, boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.fullName = fullName;
        this.birthday = birthday;
        this.status = status;
    }
}
