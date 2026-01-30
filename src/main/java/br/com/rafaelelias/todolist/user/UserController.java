package br.com.rafaelelias.todolist.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



@RestController  
@RequestMapping("/users")  
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    public UserModel create(@RequestBody UserModel userModel){ 
        log.info("Usuário recebido: {}", userModel); 
        return userModel; // também retorna no Postman 
        }

}
