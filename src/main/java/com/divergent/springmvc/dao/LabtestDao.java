package com.divergent.springmvc.dao;

import java.util.List;

import com.divergent.springmvc.entity.Labtest;

public interface LabtestDao {

	void add(Labtest labtest);

	List<Labtest> listAll();

	void remove(Labtest labtest);

	Labtest findById(int id);
}
