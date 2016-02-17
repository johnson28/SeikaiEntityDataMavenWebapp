package seikai.entity.data.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import seikai.entity.base.RecordDto;
import seikai.entity.data.GenericRecordDao;

public abstract class AbstractGenericRecordDaoImpl<Entity extends RecordDto, EntityHistory extends RecordDto, Id extends Serializable>
		implements GenericRecordDao<Entity, EntityHistory, Id> {

	private final Class<Entity> entityClass;
	private final Class<EntityHistory> entityHistoryClass;

	@SuppressWarnings("unchecked")
	public AbstractGenericRecordDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		entityClass = (Class<Entity>) pt.getActualTypeArguments()[0];
		entityHistoryClass = (Class<EntityHistory>) pt.getActualTypeArguments()[1];
	}

	@Override
	public final Class<Entity> getEntityClass() {
		return entityClass;
	}

	public final Class<EntityHistory> getEntityHistoryClass() {
		return entityHistoryClass;
	}
}
