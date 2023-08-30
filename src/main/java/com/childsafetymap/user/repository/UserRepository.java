package com.childsafetymap.user.repository;

import com.childsafetymap.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}