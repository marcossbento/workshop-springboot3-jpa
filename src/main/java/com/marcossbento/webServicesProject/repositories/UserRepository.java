package com.marcossbento.webServicesProject.repositories;

import com.marcossbento.webServicesProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
