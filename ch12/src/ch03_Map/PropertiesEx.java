package ch03_Map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//
		Properties properties = new Properties();
		
		String path = PropertiesEx.class.getResource("test.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path,"utf-8");
		//~.properties���Ϸκ��� Properties��ü�� ���� �о���̱� load(�����Է½�Ʈ��);
		properties.load(new FileReader(path));
		//properties�κ��� �� ��� getProperties(Ű);
		String db = properties.getProperty("db");
		System.out.println(db);
		String user = properties.getProperty("user");
		System.out.println(user);

	}

}
