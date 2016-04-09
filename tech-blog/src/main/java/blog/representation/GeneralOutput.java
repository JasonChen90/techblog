package blog.representation;

/**
 * 通用返回
 * @author Jason
 *
 */
public class GeneralOutput {

	//处理状态
	public String status;
	
	//错误信息
	public String errMsg;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the errMsg
	 */
	public String getErrMsg() {
		return errMsg;
	}

	/**
	 * @param errMsg the errMsg to set
	 */
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
