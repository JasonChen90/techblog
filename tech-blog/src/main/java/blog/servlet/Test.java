package blog.servlet;

import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4041742915055497196L;

	protected void doGet(HttpServletRequest req,HttpServletResponse res){
		try {
			res.getWriter().append("Now date" + new Date());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
