package com.sansoft.springcourse.repositories;

import com.sansoft.springcourse.entities.Order;
import com.sansoft.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
