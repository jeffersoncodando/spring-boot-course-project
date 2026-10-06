package com.jeffersoncodando.spring_boot_course_project.repositories;

import com.jeffersoncodando.spring_boot_course_project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
