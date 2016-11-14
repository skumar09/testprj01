package learning;

import java.util.*;

public class collection {
	public static void main(String[] args){
		List<String> abc = new ArrayList<String>();
		abc.add("California");
		abc.add("Florida");
		abc.add("Texas");
		Iterator<String> iterator = abc.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		abc.remove(1);
		Iterator<String> iterator1 = abc.iterator();
		while (iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("California", "Sacromento");
		map.put("Florida", "Talhouse");
		System.out.println(map);
		System.out.println(map.get("California"));
		
	}


	
	
	

}
