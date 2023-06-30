package com.chikhanh.crudstudent.service;


import com.chikhanh.crudstudent.model.Student;
import com.chikhanh.crudstudent.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRespository studentRespository;
    @Override
    public Student saveStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRespository.findAll();
    }
}
