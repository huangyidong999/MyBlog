package com.myblog.Controller;

import com.myblog.config.userChecker;
import com.myblog.mapper.UserMapper;
import com.myblog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 从hello页面 传来相关参数，验证该用户是否存在于数据库中，已经注册
 */
@Controller
public class UserSignInController {
    @Autowired
    public UserMapper userMapper;

    @RequestMapping("/login")
    public String Sigin(@RequestParam(value = "userName")String username,@RequestParam(value = "passWord") String password){
        List<User> userList = userMapper.findAll();
        User u = userList.get(0);
        System.out.println(u.getUser_name());
        if(username.compareTo(u.getUser_name() ) == 0 && password.compareTo(u.getUser_password()) == 0)
            return "redirect:listCategory";

            return "Hello";
    }
}
