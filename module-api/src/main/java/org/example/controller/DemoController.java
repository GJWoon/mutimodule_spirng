package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final DemoService demoService;


    @GetMapping("/")
    public String getCommon(){
        return demoService.getCommonService();
    }


    @GetMapping("/exception")
    public String exception(){
        return demoService.exception();
    }
}
