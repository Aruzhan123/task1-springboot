package com.ex.task1springboot.service;

import com.ex.task1springboot.Repos.StudentRepos;
import com.ex.task1springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public final StudentRepos studentRepository;

    public StudentService(StudentRepos studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student> getAll(){
        return (List<Student>) studentRepository.findAll();
    }


    public Student getById(long id){
        return studentRepository.findById(id).orElse(null);
    }


    public Student create(Student student){
        return studentRepository.save(student);
    }


    public Student update(Student student){
        return studentRepository.save(student);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }

}


