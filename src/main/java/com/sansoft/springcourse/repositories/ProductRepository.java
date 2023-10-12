package com.sansoft.springcourse.repositories;

import com.sansoft.springcourse.entities.Product;
import com.sansoft.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
