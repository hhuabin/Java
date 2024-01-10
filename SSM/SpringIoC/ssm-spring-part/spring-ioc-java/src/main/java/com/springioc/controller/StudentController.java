package com.springioc.controller;

import com.springioc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author bin
 * @date 2024-01-10 15:44
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
}
