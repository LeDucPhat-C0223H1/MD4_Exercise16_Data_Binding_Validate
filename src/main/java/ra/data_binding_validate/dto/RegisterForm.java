package ra.data_binding_validate.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class RegisterForm {
    private Long id;
    @NotBlank(message = "Không được để trống")
    private String
            username,
            password,
            rePassword,
            avatar = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.esquire.com%2Fentertainment%2Fmovies%2Fa41829985%2Favatar-sequel-announcements-timeline%2F&psig=AOvVaw2fCBJAXuwU-3Mbv0g5tH9V&ust=1700748893009000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCLCk6r7l14IDFQAAAAAdAAAAABAE",
            fullName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    public String message;

    public RegisterForm() {
    }

    public RegisterForm(Long id, String username, String password, String rePassword, String avatar, String fullName, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rePassword = rePassword;
        this.avatar = avatar;
        this.fullName = fullName;
        this.birthday = birthday;

    }

    public String getMessage() {
        return message;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
