package SeleniumHierarchy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,String> userMap = new HashMap<String, String>();
		userMap.put("ADMIN", "arjun@gmail.com_test123");
		userMap.put("Security", "secu@gmail.com_get123");
		
		
		String value = userMap.get("ADMIN");
		System.out.println(value);
		
		Set<String> keysSEt = userMap.keySet();
		keysSEt.forEach(valuest->{
			System.out.println(valuest);
		});
		
		System.out.println("----------------");
		Set<Entry<String, String>> keys = userMap.entrySet();
		
		for(Entry<String, String> str:keys) {
			System.out.println(str.getKey()+" - "+str.getValue());
			
		}
	

	}

	public static Map<String, String> addUserCredentials() {
		Map<String,String> userMap = new HashMap<String, String>();
		userMap.put("ADMIN", "arjun@gmail.com_test123");
		userMap.put("Security", "secu@gmail.com_get123");
		return userMap;
		
	}
	
}
