package com.idat.student.domain.service;

import com.idat.student.domain.model.Student;
import com.idat.student.domain.model.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(String uid) {
        return studentRepository.findById(uid);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public void delete(String uid) {
        studentRepository.delete(uid);
    }

}
