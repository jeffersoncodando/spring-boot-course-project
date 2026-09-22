package com.jeffersoncodando.spring_boot_course_project.repositories;

import com.jeffersoncodando.spring_boot_course_project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
