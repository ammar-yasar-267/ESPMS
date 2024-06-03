package com.ESPMS.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentJpaRepository;

    public List<Students> findAll() {
        return (List<Students>) studentJpaRepository.findAll();
    }

    public Optional<Students> findStudentByID(Long id) {
        return studentJpaRepository.findByID(id);
    }

    public Students save(Students student) {
        // Perform additional processing if needed
        return studentJpaRepository.save(student);
    }

    public void deleteById(Long id) {
        studentJpaRepository.deleteById(id);
    }
}
