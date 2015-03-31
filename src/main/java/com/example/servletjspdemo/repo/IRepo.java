package com.example.servletjspdemo.repo;

import java.util.List;

public interface IRepo<TUnit> {

	public void save(TUnit unit);
	public void delete(TUnit unit);
	public void update(TUnit update);
	public TUnit get(int id);
	public List<TUnit> getAll();
	
}
