package edu.icet.contoller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/student/{name}")
    public List<Student> getStudent(@PathVariable String name,
                                    @RequestParam String id,
                                    @RequestParam String age){
        log.debug(name);
      return service.getStudent();
    }
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return student;
    }
}
