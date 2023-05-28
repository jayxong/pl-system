package com.yeanson.ddd.domain.order.repository;

import com.yeanson.ddd.domain.order.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {
}
