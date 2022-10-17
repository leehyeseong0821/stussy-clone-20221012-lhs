package com.stussy.stussyclone20221012lhs.api;

import com.stussy.stussyclone20221012lhs.dto.RegisterReqdDto;
import com.stussy.stussyclone20221012lhs.dto.validation.ValidationSequence;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/account")
@RestController //데이터 통신하기위해 일반 컨트롤러에 리스폰스바디를 가지고 있는 컨트롤러
public class AccountApi {

    @PostMapping("/register")                                                            //Result 결과 벨리데이션과 연결된 결과
    public ResponseEntity<?> register(@Validated(ValidationSequence.class) @RequestBody RegisterReqdDto registerReqdDto , BindingResult bindingResult){

        if(bindingResult.hasErrors()) {
            Map<String,String> errorMap = new HashMap<String, String>();

            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println("필드명:"+fieldError.getField());
                System.out.println("에러메세지:" + fieldError.getDefaultMessage());
                errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
            }

            return ResponseEntity.badRequest().body(errorMap);
        }
        return ResponseEntity.created(null).body(null);
    }

}
