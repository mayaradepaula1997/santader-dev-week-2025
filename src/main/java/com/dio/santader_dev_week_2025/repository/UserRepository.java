package com.dio.santader_dev_week_2025.repository;

import com.dio.santader_dev_week_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
