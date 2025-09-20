package com.example.springsecurity.Controller;

import com.example.springsecurity.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/security")
public class StudController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1,43, "urvish"),
            new Student(2,75, "roy")
    ));

    @GetMapping("/student")
    public List<Student> getStudent() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getcsrftoken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
