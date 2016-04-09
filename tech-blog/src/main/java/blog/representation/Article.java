package blog.representation;

/**
 * 
 * @author Jason
 *
 */
public class Article {

	//article id
	public int aricleId;
	
	//article title
	public String aricleTitle;
	
	//article brief
	public String brief;
	
	//article content
	public String content;
	
	//article type(java/.net etc.)
	public String articleType;

	/**
	 * @return the aricleId
	 */
	public int getAricleId() {
		return aricleId;
	}

	/**
	 * @param aricleId the aricleId to set
	 */
	public void setAricleId(int aricleId) {
		this.aricleId = aricleId;
	}

	/**
	 * @return the aricleTitle
	 */
	public String getAricleTitle() {
		return aricleTitle;
	}

	/**
	 * @param aricleTitle the aricleTitle to set
	 */
	public void setAricleTitle(String aricleTitle) {
		this.aricleTitle = aricleTitle;
	}

	/**
	 * @return the brief
	 */
	public String getBrief() {
		return brief;
	}

	/**
	 * @param brief the brief to set
	 */
	public void setBrief(String brief) {
		this.brief = brief;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the articleType
	 */
	public String getArticleType() {
		return articleType;
	}

	/**
	 * @param articleType the articleType to set
	 */
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}
}
