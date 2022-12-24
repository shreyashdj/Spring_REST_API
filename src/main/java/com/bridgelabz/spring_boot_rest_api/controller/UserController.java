package com.bridgelabz.spring_boot_rest_api.controller;

import com.bridgelabz.spring_boot_rest_api.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class UserController {
    @GetMapping("/get")
    public String getMessage(){
        return "Hello World";
    }
    @GetMapping("/helloByName/{name}")
    public String getHelloByName(@PathVariable String name) {
        return "Hello " + name;
    }

    @PutMapping("/put/{firstName}")
    public String putMessage(@PathVariable String firstName, @RequestParam ( value = "lastName") String lastName) {
        return "Hello " + firstName+" "+ lastName;
    }
    @PostMapping("/helloUser")
    public String postMessage(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}