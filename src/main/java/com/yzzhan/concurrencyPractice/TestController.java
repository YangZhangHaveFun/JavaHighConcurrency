package com.yzzhan.concurrencyPractice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
