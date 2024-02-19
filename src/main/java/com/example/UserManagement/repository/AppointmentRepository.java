package com.example.UserManagement.repository;

import com.example.UserManagement.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Query("SELECT a FROM Appointment a JOIN FETCH a.user")
    List<Appointment> findAllAppointmentsWithUserDetails();
}
