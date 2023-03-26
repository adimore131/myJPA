package com.jpa.tutorial.bootstrap;

import com.jpa.tutorial.entity.CourseComposite;
import com.jpa.tutorial.entity.NameId;
import com.jpa.tutorial.entity.Subject;
import com.jpa.tutorial.repository.CourseCompositeRepository;
import com.jpa.tutorial.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    SubjectRepository repo;

    @Override
    public void run(String... args) throws Exception {
        //Here you can initialize the DB
        //First clean the DB table
//        repo.deleteAll();
        //Then add new data
//        Subject subject1 = Subject.builder()
//                .subjectName("Math")
//                .marksObtained(50)
//                .totalMarks(100)
//                .passingMarks(35)
//                .build();
//        Subject savedSub1 = repo.save(subject1);
//
//        Subject subject2 = Subject.builder()
//                .subjectName("English")
//                .marksObtained(57)
//                .totalMarks(100)
//                .passingMarks(35)
//                .build();
//        Subject savedSub2 = repo.save(subject2);
//        repo.findAll().forEach(subject -> {
//            System.out.println("Subject ID : " +subject.getSubjectId());
//            System.out.println("Subject Name : " +subject.getSubjectName());
//        });
    }
}
