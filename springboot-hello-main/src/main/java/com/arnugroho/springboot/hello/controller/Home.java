package com.arnugroho.springboot.hello.controller;

import com.arnugroho.springboot.hello.model.dto.FieldMappingDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping("/hai")
    public String hello(){
        return "hello";
    }

    @GetMapping("/field-mapping")
    public FieldMappingDto fieldMapping() {
        return new FieldMappingDto();
    }


}
