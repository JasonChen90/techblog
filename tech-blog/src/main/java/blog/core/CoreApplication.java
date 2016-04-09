package blog.core;

import org.apache.log4j.Logger;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import blog.resources.OrderResource;

public class CoreApplication extends ResourceConfig {

	final static Logger logger = Logger.getLogger(CoreApplication.class);
	
	public CoreApplication(){
		logger.info("CoreApplication started...");
		//register(RequestContextFilter.class);
		register(CORSRequestFilter.class);
		register(CORSResponseFilter.class);
		register(OrderResource.class);
		register(JacksonFeature.class);
	}
}
