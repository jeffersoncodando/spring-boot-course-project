package com.jeffersoncodando.spring_boot_course_project.repositories;

import com.jeffersoncodando.spring_boot_course_project.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
