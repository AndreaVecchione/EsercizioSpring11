package com.example.EsercizioSpring11.repositories;

import com.example.EsercizioSpring11.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
