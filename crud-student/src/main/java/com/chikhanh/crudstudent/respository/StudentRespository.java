package com.chikhanh.crudstudent.respository;

import com.chikhanh.crudstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long> {
}
