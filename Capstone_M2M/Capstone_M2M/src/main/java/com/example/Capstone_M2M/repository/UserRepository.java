package com.example.Capstone_M2M.repository;

import com.example.Capstone_M2M.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {


}
