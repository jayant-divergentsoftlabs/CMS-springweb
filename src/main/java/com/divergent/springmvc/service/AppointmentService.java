package com.divergent.springmvc.service;

import java.util.List;

import com.divergent.springmvc.entity.Appointment;

public interface AppointmentService {
	
public void add(int appointmentId, String problem, int patientId, int doctorId);
	
	public List<Appointment> getList();

	

}
