package com.chikhanh.crudstudent.service;

import com.chikhanh.crudstudent.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
