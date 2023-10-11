package com.marcossbento.webServicesProject.repositories;

import com.marcossbento.webServicesProject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
