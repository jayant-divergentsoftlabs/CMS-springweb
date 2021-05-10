package com.divergent.springmvc.dao;

import java.util.List;

import com.divergent.springmvc.entity.Patient;

public interface PatientDao {
	public void add(Patient patient);

	public void remove(Patient patient);

	Patient findById(int id);

	public List<Patient> listAll();
}
