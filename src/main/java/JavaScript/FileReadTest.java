package JavaScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FileReadTest {

	public static void main(String[] args) {
		
		
		try {
			String fis = " Pune yerwada hinjewadi pune ";
			
			FileReader read = new FileReader(fis);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	String str = "Pune yerwada pune wagoholi";
		
	String arr[] = str.split(" ");
	
	Map<String,Integer> storeMap = new HashMap<String,Integer>();
		for (String name : arr) {

			if (storeMap.containsKey(name)) {

				storeMap.put(name, storeMap.get(name) + 1);
			} else {
				storeMap.put(name, 1);

			}

		}
	
	Set<Entry<String,Integer>> entry	=storeMap.entrySet();
		
	for(Entry<String,Integer> ent : entry) {
		
		if(ent.getValue()>1) {
			
			System.out.println("Key "+ent.getKey() + " and Value: " + ent.getValue() );
		}
	}
		
	
	int arr1[] = {30, 5, 10 , 100, 15};
	
	for(int i= 0; i<arr1.length ; i++) {
		for(int j= 0; j<arr1.length ; i++) {
			
		
	}
		
		
	
	
	
	

	}

	}}
