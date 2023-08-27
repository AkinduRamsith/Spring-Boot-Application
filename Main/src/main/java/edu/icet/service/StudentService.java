package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    public Iterable<StudentEntity> getStudent();
    public void createStudent(Student student);

    List<Student> getStudentByFirstName();
}
