package com.sansoft.springcourse.repositories;

import com.sansoft.springcourse.entities.OrderItem;
import com.sansoft.springcourse.entities.User;
import com.sansoft.springcourse.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
