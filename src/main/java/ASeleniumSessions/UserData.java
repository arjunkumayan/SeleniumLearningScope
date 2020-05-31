package ASeleniumSessions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {
	
	// Difference
	
	// hashMap is non synchronized -- not thread safe

	public static void main(String[] args) {
		
   // HashMap<String,String> userMap = new HashMap<String,String>();

    Map<String,String> userMap = new HashMap<String,String>();
    userMap.put("id", "1");
    userMap.put("name", "tom");
    userMap.put("city", "Bangalore");
    
    System.out.println(userMap.get("id")); 
    //System.out.println(userMap.get(0));
    
    System.out.println(userMap.size());
    
		for(Map.Entry m : userMap.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		
		// hashtable
		
		Map<String,String> productTable = new Hashtable<String,String>();
		
		productTable.put("Apple Mackbook", "2000");
		productTable.put("windows Hp laptop", "1000");
		productTable.put("Apple iphone X", "1500");
		
		System.out.println(productTable);
		System.out.println(productTable.get("Apple Mackbook"));
		

		for(Map.Entry m : productTable.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
				
		
	}

}
