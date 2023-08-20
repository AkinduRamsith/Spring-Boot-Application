package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplV2 implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Value("${student.institute}")
    String institute;
    @Value("${student.batch}")
    int batch;
    public Iterable<StudentEntity> getStudent(){
       return studentRepository.findAll();
    }
    public void createStudent(Student student){
        StudentEntity model=new StudentEntity();
        model.setFirstName(student.getFirstName());
        model.setLastName(student.getLastName());
        model.setInstitute(institute);
        model.setBatch(batch);
        studentRepository.save(model);
    }

    @Override
    public Iterable<StudentEntity> getStudentByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }
}
