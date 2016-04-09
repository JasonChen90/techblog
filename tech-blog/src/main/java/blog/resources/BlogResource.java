package blog.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import blog.representation.Blog;
import blog.representation.GeneralOutput;

@Component
@Path("/article")
public class BlogResource {

	/**
	 * 获取博客list(分页获取)
	 * @param index 
	 * @param count
	 */
	@GET
	@Path("/articleList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Blog> getBlogList(int index,int count){
		List<Blog> blogs = new ArrayList<Blog>();
		return blogs;
	}
	
	@POST
	@Path("/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralOutput editBlog(Blog blog){
		GeneralOutput output = new GeneralOutput();
		return output;
	}
	
	@GET
	@Path("/showBlog")
	@Produces(MediaType.APPLICATION_JSON)
	public Blog showBlog(int blogId){
		Blog blog = new Blog();
		return blog;
	}
}
