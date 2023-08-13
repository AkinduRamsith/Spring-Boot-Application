package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//@Service
public class StudentServiceImpl implements StudentService{
    public List<Student> getStudent(){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Akindu","ICET"));
        list.add(new Student("Kamal","ICET"));

        return list;
    }
}
