package com.example.newapp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    

        @GetMapping("welcome")
        public String wish(){
            return "Welcome !!!";
        }

}
