package com.divergent.springmvc.service;

import java.util.List;

import com.divergent.springmvc.entity.Labtest;

public interface LabtestService {
	public void add(String name, int price);

	public boolean remove(int id);

	public Labtest findById(int id);
	
	public List<Labtest> list();
}
