package cn.hselfweb.jsp.coding.controller;

import cn.hselfweb.jsp.coding.db.User;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping(path = "validator")
public class UserController {
    public void logIn(String userName ,String password){

    }
}
