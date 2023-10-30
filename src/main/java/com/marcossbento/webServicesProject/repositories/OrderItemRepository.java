package com.marcossbento.webServicesProject.repositories;

import com.marcossbento.webServicesProject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
