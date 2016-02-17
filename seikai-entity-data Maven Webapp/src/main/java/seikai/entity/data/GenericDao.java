package seikai.entity.data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import seikai.entity.base.BaseDto;

public interface GenericDao<Entity extends BaseDto, Id extends Serializable> {

	Class<Entity> getEntityClass();

	Id save(Entity entity);

	void saveOrUpdate(Entity entity);

	Entity get(Id id);

	Entity load(Id id);

	void refresh(Entity entity);

	List<Entity> findAll();

	List<Entity> findByExample(Entity exampleEntity);

	List<Entity> findByExample(Entity exampleEntity, int firstResult, int maxResults);

	List<Entity> findByRestrictions(Map<String, Serializable> params);

	List<Entity> findByRestrictions(Map<String, Serializable> params, int firstResult, int maxResults);

	void update(Entity entity);

	void delete(Entity entity);

	void delete(Id id);

	int countAll();

	int countByExample(Entity exampleEntity);

	int countByRestrictions(Map<String, Serializable> params);
}
