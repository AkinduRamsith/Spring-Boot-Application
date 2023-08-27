package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentServiceImplV2 implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Value("${student.institute}")
    String institute;
    @Value("${student.batch}")
    int batch;

    public Iterable<StudentEntity> getStudent() {
        return studentRepository.findAll();
    }

    public void createStudent(Student student) {
        StudentEntity model = new StudentEntity();
        model.setFirstName(student.getFirstName());
        model.setLastName(student.getLastName());
        model.setInstitute(institute);
        model.setBatch(batch);
        studentRepository.save(model);
    }

    @Override
    public List<Student> getStudentByFirstName() {
        Iterable<StudentEntity> studentList = studentRepository.findAll();
        Iterator<StudentEntity> iterator = studentList.iterator();
        List<Student> studentModels = new ArrayList<>();
        while (iterator.hasNext()) {
            StudentEntity entity = iterator.next();
            studentModels.add(Student.builder()
                    .id(entity.getId())
                    .firstName(entity.getFirstName())
                    .lastName(entity.getLastName())
                    .batch(entity.getBatch())
                    .institute(entity.getInstitute())
                    .build());
        }
        return studentModels;
    }
}
