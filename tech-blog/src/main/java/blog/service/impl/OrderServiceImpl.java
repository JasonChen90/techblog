package blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import blog.repository.order.OrderRepository;
import blog.service.OrderService;

@Configuration
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void exec() {
		orderRepository.all();

	}

}
