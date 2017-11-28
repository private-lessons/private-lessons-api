package nao.plessons.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {


    @GetMapping
    public String getUsers() {

        return "App works";
    }

}
