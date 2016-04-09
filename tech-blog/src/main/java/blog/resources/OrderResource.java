package blog.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import blog.core.CoreApplication;
import blog.representation.Order;
import blog.service.OrderService;

@Component
@Path("/order")
public class OrderResource {

	@Autowired
	private OrderService orderService;
	
	final static Logger logger = Logger.getLogger(OrderResource.class);
	
	
	@POST
	@Path("/searchOrder")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Order execSearchOrder(Order order2){
		logger.debug("OrderResource debug...");
		orderService.exec();
		Order order = new Order();
		order.setOrderId(111);
		order.setFullName("chenjian");
		return order;
	}
}
