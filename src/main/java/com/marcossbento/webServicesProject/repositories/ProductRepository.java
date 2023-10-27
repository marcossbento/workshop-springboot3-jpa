package com.marcossbento.webServicesProject.repositories;

import com.marcossbento.webServicesProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
