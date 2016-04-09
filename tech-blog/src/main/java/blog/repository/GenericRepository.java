package blog.repository;

import java.util.List;

public interface GenericRepository<T,K> {

	List<T> all();
	
	T getById(K k);
	
	boolean updateOrder(T entity);
}
