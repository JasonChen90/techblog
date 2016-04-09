package blog.repository.order.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import blog.repository.order.OrderRepository;
import blog.representation.Order;

@Configuration
public class OrderRepositoryImpl implements OrderRepository {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public List<Order> all() {
		/** NamedParameterJdbcTemplate
		String sql = "select * from table_order where orderId = :orderId and orderName = :orderName";
		Map<String,String> namedParameters = new HashMap<String,String>();
		namedParameters.put("orderId", "11111");
		namedParameters.put("orderName", "fsfse");
		namedParameterJdbcTemplate.queryForObject("", namedParameters, Order.class);
		namedParameterJdbcTemplate.queryForList("", namedParameters, Order.class);
		final List<Order> orders = new ArrayList<Order>();
		namedParameterJdbcTemplate.query("", namedParameters, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Order order = new Order();
				order.setOrderId(rs.getInt("orderId"));
				order.setFullName(rs.getString("fullName"));
				orders.add(order);
			}
		});
		*/
		return null;
	}

	@Override
	public Order getById(Integer k) {
		/**SimpleJdbcCall
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		SimpleJdbcCall simple = new SimpleJdbcCall(jdbcTemplate);
		simple.withProcedureName("").withoutProcedureColumnMetaDataAccess();
		simple.useInParameterNames("in_id");
		simple.declareParameters(
				new SqlParameter("in_id",Types.INTEGER),
				new SqlOutParameter("", Types.CHAR)
				);
				*/
		return null;
	}

	@Override
	public boolean updateOrder(Order entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
