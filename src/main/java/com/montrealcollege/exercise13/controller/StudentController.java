package com.montrealcollege.exercise13.controller;

import com.montrealcollege.exercise13.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private Student student;

    @ModelAttribute("student")
    public Student getStudent() {
        return student;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute(new Student());
        return "studentForm";
    }

    @PostMapping("/createStudent")
    public String createStudent(@ModelAttribute("student") Student student, Model model) {
        model.addAttribute("name", student.getFirstName() + " " + student.getLastName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("phone", student.getPhoneNumber());
        model.addAttribute("address", student.getAddress());
        return "result";
    }

    @PostMapping("/studentCreated")
    public String studentCreated(@ModelAttribute("student") Student student, Model model) {
        return "result1";
    }
}
