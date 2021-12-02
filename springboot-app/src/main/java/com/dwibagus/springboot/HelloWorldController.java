package com.dwibagus.springboot;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @PostMapping
    public ResponseEntity<HelloWorld> getHelloWorld(){
        return ResponseEntity.ok(new HelloWorld());
    }

}
