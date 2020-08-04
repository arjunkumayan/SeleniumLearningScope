package SeleniumHierarchy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WindowPopup {

	public static void main(String[] args) {
		
		
		Set<String> tvSeries = new HashSet<>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("The Big bank theory");
		tvSeries.add("The Pigeon Break");
		tvSeries.add("Laanko mai ek");
		
		ArrayList<String> al = new ArrayList<>();
		
//		al.addAll(tvSeries);
//		
//		al.forEach(shows ->{
//			System.out.println(shows);
//		});
		
		tvSeries.forEach(values ->{
			al.add(values);
			
			//System.out.println(values);
			
			
		});
		
		al.forEach(shows ->{
			System.out.println(shows);
		});
		
		ArrayList<String> al2 = new ArrayList<>();
		Iterator<String> showsSeries = tvSeries.iterator();
		while(showsSeries.hasNext()) {
			String text = showsSeries.next();
			al2.add(text);

		}
		
		al2.forEach(val ->{
			
			System.out.println(val);
		});

	}

}
