package com.jeffersoncodando.spring_boot_course_project.repositories;

import com.jeffersoncodando.spring_boot_course_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
