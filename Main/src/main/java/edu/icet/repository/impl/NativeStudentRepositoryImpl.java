package edu.icet.repository.impl;

import edu.icet.repository.NativeStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Repository
public class NativeStudentRepositoryImpl implements NativeStudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Integer retrieveStudentCount(){
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM student;",Integer.class);
    }

    public List<String> retrieveFirstNameOfAllStudent(){
        return jdbcTemplate.queryForList("SELECT first-name FROM STUDENT;",String.class);
    }

    public List<String> retrieveFirstNameById(String id){
        return namedParameterJdbcTemplate.queryForList("SELECT first_name from student where id=:id", Collections.singletonMap("id",id),String.class);
    }
}
