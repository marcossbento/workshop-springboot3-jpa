package com.marcossbento.webServicesProject.repositories;

import com.marcossbento.webServicesProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
