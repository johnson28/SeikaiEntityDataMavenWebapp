package seikai.entity.data.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import seikai.entity.base.BaseDto;
import seikai.entity.data.GenericPagingDao;

public abstract class AbstractGenericPagingDaoImpl<Entity extends BaseDto, Condition> implements
		GenericPagingDao<Entity, Condition> {

	private final Class<Entity> entityClass;

	@SuppressWarnings("unchecked")
	public AbstractGenericPagingDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		entityClass = (Class<Entity>) pt.getActualTypeArguments()[0];
	}

	@Override
	public final Class<Entity> getEntityClass() {
		return entityClass;
	}

}
