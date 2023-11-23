package ra.data_binding_validate.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.data_binding_validate.dto.RegisterForm;
import ra.data_binding_validate.service.UserService;

@Component
public class RegisterValidate implements Validator {
    @Autowired
    private UserService userService ;

    @Override
    public boolean supports(Class<?> clazz) {
        return RegisterForm.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        RegisterForm RV = (RegisterForm) object;
        if (!userService.register(RV)){
            errors.rejectValue("username","username","Tên đăng nhập đã ồn tại");
        }
        if(!RV.getPassword().equals(RV.getRePassword())){
            errors.rejectValue("rePassword","username","Nhập lại password không đúng");
        }
    }
}
