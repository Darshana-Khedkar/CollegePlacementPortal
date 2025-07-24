package com.college.college.repo;

import com.college.college.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
    public void save(Student s) {
        System.out.println("save method works");
    }
}
