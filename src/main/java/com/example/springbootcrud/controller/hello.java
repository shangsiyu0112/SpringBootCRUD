package com.example.springbootcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @athor 尚思雨
 * @date 2020-05-18-0:37
 */
@Controller
public class hello {

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
     return "hello";
 }

 @RequestMapping("/success")
 public String success(Map<String,Object> map){
        map.put("success","成功");
        return "success";
 }
}
