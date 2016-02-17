package seikai.entity.data.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import seikai.entity.base.BaseDto;
import seikai.entity.data.GenericDao;

public abstract class AbstractGenericDaoImpl<Entity extends BaseDto, Id extends Serializable> implements
		GenericDao<Entity, Id> {

	private final Class<Entity> entityClass;

	@SuppressWarnings("unchecked")
	public AbstractGenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		entityClass = (Class<Entity>) pt.getActualTypeArguments()[0];
	}

	@Override
	public final Class<Entity> getEntityClass() {
		return entityClass;
	}

}
