package com.example.UserManagement.controller;

import com.example.UserManagement.model.Appointment;
import com.example.UserManagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;
    @GetMapping
    public List<Appointment> getAllAppointmentsWithUserDetails() {
        return appointmentService.getAllAppointmentsWithUserDetails();
    }
}
