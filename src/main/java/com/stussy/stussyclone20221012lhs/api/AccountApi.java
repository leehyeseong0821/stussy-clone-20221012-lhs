package com.stussy.stussyclone20221012lhs.api;

import com.stussy.stussyclone20221012lhs.dto.RegisterReqdDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/account")
@RestController //데이터 통신하기위해 일반 컨트롤러에 리스폰스바디를 가지고 있는 컨트롤러
public class AccountApi {

    @PostMapping("/register")
    public ResponseEntity<?> register(RegisterReqdDto registerReqdDto){
        System.out.println("회원가입 요청 데이터 "+registerReqdDto);
        return null;
    }

}
