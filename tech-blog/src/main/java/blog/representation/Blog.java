package blog.representation;

/**
 * 
 * @author Jason
 *
 */
public class Blog {

	//blog
	public int blogId;
	
	//article
	public Article article;
	
	//type of blogs(reshipment/original etc.)
	public String blogType;
	
	//when blog is not article, question etc.,blog title will be valued
	public String blogTitle;

	/**
	 * @return the blogId
	 */
	public int getBlogId() {
		return blogId;
	}

	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

	/**
	 * @return the blogType
	 */
	public String getBlogType() {
		return blogType;
	}

	/**
	 * @param blogType the blogType to set
	 */
	public void setBlogType(String blogType) {
		this.blogType = blogType;
	}

	/**
	 * @return the blogTitle
	 */
	public String getBlogTitle() {
		return blogTitle;
	}

	/**
	 * @param blogTitle the blogTitle to set
	 */
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
}
