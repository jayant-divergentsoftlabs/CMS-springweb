package com.divergent.springmvc.service;

import java.util.List;

import com.divergent.springmvc.entity.Patient;

public interface PatientService {
	public void add(String name, int age, String gender, int weight,long contactNo, String address);

	public boolean remove(int id);

	public Patient findById(int id);
	
	public List<Patient> listAll();
}
