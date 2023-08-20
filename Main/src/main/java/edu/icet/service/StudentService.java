package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;

public interface StudentService {
    public Iterable<StudentEntity> getStudent();
    public void createStudent(Student student);

    Iterable<StudentEntity> getStudentByFirstName(String firstName);
}
