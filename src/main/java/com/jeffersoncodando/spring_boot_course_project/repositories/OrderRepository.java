package com.jeffersoncodando.spring_boot_course_project.repositories;

import com.jeffersoncodando.spring_boot_course_project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
