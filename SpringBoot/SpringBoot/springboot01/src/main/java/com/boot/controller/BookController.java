package com.boot.controller;

import com.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bin
 * @date 2023-02-03-10:14
 */
@Controller
public class BookController {

    @Value(("${person.name}"))
    private String name;

    @Autowired
    public Person person;

    @ResponseBody
    @RequestMapping("/hello")
    public String getById() {

        System.out.println("name: " + name);
        System.out.println(person);
        return "Hello SpringBoot";
    }
}
