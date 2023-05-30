package com.springboot.w2_pt.controller;

import com.springboot.w2_pt.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "SonMinGi";
    }
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
        return name + " " +email + " "+ organization;
    }
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + ":" + map.getValue()+"\n");
        });
        return sb.toString();
    }
    @GetMapping(value = "/request3") //Dto로 파라미터 값 받고 Get
    public String getRequestParam3(MemberDto memberDto){
        return memberDto.toString();
    }


}
