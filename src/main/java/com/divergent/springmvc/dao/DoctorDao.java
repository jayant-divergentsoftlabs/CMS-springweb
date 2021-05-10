package com.divergent.springmvc.dao;

import java.util.List;

import com.divergent.springmvc.entity.Doctor;

public interface DoctorDao {
	void add(Doctor doctor);

	List<Doctor> listAll();

	void remove(Doctor doctor);

	Doctor findById(int id);

}
