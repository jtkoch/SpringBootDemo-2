package com.galaxe.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This is the Data Access Layer

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	// @Query("SELECT s FROM Student s WHERE s.email = ?1")
	Optional<Student> findStudentByEmail(String email);
}
 