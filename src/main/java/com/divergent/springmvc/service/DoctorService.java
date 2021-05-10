package com.divergent.springmvc.service;

import java.util.List;

import com.divergent.springmvc.entity.Doctor;

public interface DoctorService {
	void add(String name, String speciality, int fee);

	boolean remove(int id);

	Doctor findById(int id);

	List<Doctor> listAll();


}
