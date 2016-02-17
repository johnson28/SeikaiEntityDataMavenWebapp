package seikai.entity.data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import seikai.entity.base.RecordDto;

public interface GenericRecordDao<Entity extends RecordDto, EntityHistory extends RecordDto, Id extends Serializable> {

	Class<Entity> getEntityClass();

	Id save(Entity entity) throws Exception;

	void saveOrUpdate(Entity entity) throws Exception;

	Entity get(Id id);

	Entity load(Id id);

	void refresh(Entity entity);

	List<Entity> findAll();

	List<Entity> findAllEnable();

	List<Entity> findByExample(Entity exampleEntity);

	List<Entity> findByExample(Entity exampleEntity, int firstResult, int maxResults);

	List<Entity> findByRestrictions(Map<String, Serializable> params);

	List<Entity> findByRestrictions(Map<String, Serializable> params, int firstResult, int maxResults);

	void update(Entity entity) throws Exception;

	void delete(Entity entity) throws Exception;

	void delete(Id id) throws Exception;

	int countAll();

	int countByExample(Entity exampleEntity);

	int countByRestrictions(Map<String, Serializable> params);

}
