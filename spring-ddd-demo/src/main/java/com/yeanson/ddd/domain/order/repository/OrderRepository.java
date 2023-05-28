package com.yeanson.ddd.domain.order.repository;

import com.yeanson.ddd.domain.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
