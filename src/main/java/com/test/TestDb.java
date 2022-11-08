package com.test;


import com.test.Objects.Entities.Student;
import com.test.Services.GeneralManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestDb {

    @Autowired
    private GeneralManager generalManager;


    @PostConstruct
    public void init () {
        new Thread(() -> {
            Student student = new Student();
            student.setName("John");
            generalManager.save(student);
            Student s1 = generalManager.loadObject(Student.class, 1);
            System.out.println();
        }).start();
    }

}
