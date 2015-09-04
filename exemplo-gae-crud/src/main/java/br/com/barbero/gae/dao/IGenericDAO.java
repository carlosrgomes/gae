package br.com.barbero.gae.dao;

import java.util.List;
import java.util.Map;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Result;

public interface IGenericDAO<T> {
	
	public Result<Key<T>> save(T entity);
	public Result<Map<Key<T>, T>> saveAll(List<T> entity);
	public List<T> list();
	

}