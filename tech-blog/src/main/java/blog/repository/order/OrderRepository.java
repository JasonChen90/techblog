package blog.repository.order;

import org.springframework.context.annotation.Configuration;

import blog.repository.GenericRepository;
import blog.representation.Order;

@Configuration
public interface OrderRepository extends GenericRepository<Order,Integer> {

}
