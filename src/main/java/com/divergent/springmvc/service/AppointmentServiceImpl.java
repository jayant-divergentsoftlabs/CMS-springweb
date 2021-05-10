package com.divergent.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergent.springmvc.dao.AppointmentDao;
import com.divergent.springmvc.entity.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentDao appointmentDao;

	@Transactional
	@Override
	public void add(int appointmentId, String problem, int patientId, int doctorId) {

		Appointment appointment = new Appointment();
		appointment.setId(appointmentId);
		appointment.setProblem(problem);
		appointmentDao.add(appointment);
	}

	@Override
	public List<Appointment> getList() {
		return appointmentDao.get();
	}

}
