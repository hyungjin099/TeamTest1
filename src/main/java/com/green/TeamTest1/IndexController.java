package com.green.TeamTest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //시작페이지
    @GetMapping("/")
    public String main(){
        System.out.println("지옥에 온 것을 환영합니다~");
        System.out.println("지옥에 온 것을 환영합니다~");
        return "index";
    }

}
