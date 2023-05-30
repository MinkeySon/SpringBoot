package com.springboot.w2_pt.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {
    @DeleteMapping(value = "/{variable")
    public String DeleteVariable(@PathVariable String variable){
        return variable + "이 정상적으로 삭제됨."; //보통 state return
    }
}
