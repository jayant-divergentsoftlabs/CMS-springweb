package com.divergent.springmvc.dao;

import java.util.List;

import com.divergent.springmvc.entity.Appointment;


public interface AppointmentDao {

public void add(Appointment appointment);
	
	public List<Appointment> get();
	
}


