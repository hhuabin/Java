package com.springmvc.controller;

import com.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bin
 * @date 2024-02-05 16:41
 */
@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {

    @PostMapping("data")
    public Person addPerson(@RequestBody Person person) {
        System.out.println("person=" + person.toString());
        return person;
    }
}
