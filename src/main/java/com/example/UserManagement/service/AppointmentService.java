package com.example.UserManagement.service;

import com.example.UserManagement.model.Appointment;
import com.example.UserManagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> getAllAppointmentsWithUserDetails() {
        return appointmentRepository.findAllAppointmentsWithUserDetails();
    }
}
