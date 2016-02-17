package seikai.entity.data;

import java.util.List;

import seikai.entity.base.BaseDto;

public interface GenericPagingDao<Entity extends BaseDto, Condition> {

	Class<Entity> getEntityClass();

	List<Entity> findPagingResults(Condition condition, int firstResult, int maxResults);

	<ResultClass> List<ResultClass> findPagingTransformResults(Condition condition, int firstResult, int maxResults,
			Class<ResultClass> resultClass);

	long getRowCount(Condition condition);

}
