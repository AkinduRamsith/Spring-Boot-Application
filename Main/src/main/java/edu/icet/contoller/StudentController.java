package edu.icet.contoller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;
//    @GetMapping
//    public Iterable<StudentEntity> getStudent(){
//      return service.getStudent();
//    Ite
    @PostMapping
    public void createStudent(@RequestBody Student student){
       service.createStudent(student);
    }
    @GetMapping
    public List<Student> getStudentByFirstName(){
        return service.getStudentByFirstName();
    }


}
