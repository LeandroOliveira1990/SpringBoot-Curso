package com.aprendendospring.course.repositories;

import com.aprendendospring.course.entities.Order;
import com.aprendendospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
