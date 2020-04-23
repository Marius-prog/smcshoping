package com.shoping.models;

import com.shoping.models.data.Admin;
import com.shoping.models.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {


    Admin findByUsername(String username);
}
