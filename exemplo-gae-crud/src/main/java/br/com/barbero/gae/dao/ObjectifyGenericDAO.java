package br.com.barbero.gae.dao;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;


public abstract class ObjectifyGenericDAO<T>  implements IGenericDAO<T> {

	protected Class<T> clazz;
	
	public ObjectifyGenericDAO() {
		clazz = ((Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		ObjectifyService.register(clazz);  
	}
	
	public Result<Key<T>> save(T entity) {
		return ofy().save().entity(entity);
	}
	
	@Override
	public Result<Map<Key<T>, T>> saveAll(List<T> entities) {
		Result<Map<Key<T>, T>> entitiesr = ofy().save().entities(entities);
		return entitiesr;
	}
	
	@Override
	public List<T> list() {
		List<T> list = ofy().load().type(clazz).list();
		return list;
	}
	
	
}