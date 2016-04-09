package blog.representation;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import blog.core.CustomJsonDateDeserializer;

public class Order {

	private Integer orderId;
	
	private String fullName;
	
	private Date payTime;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	public Date getPayTime() {
		return payTime;
	}

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
}
