package com.stussy.stussyclone20221012lhs.Controller;

import com.stussy.stussyclone20221012lhs.dto.RegisterReqdDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @GetMapping("/account/login")
    public String login(){
        return "account/login";
    }
    @GetMapping("/account/register")
    public String register(){
        return "account/register";
    }

}
