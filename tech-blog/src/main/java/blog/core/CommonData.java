package blog.core;

import java.io.InputStream;
import java.util.Properties;

public class CommonData {

	public final static Properties props;
	static {
		props = new Properties();
		try{
			InputStream is = CommonData.class.getResourceAsStream("/conf/config.properties");
			props.load(is);
		}catch(Exception ex){
		}
	}
}
