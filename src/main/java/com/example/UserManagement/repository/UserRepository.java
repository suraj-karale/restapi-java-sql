package com.example.UserManagement.repository;

import com.example.UserManagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

//     @Query("SELECT userName FROM Users")
//     List<Users> getAllUsersByQuery();
}
