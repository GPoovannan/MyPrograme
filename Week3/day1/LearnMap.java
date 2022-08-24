package Week3.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("t", 2);
		map.put("e", 2);
		map.put("s", 1);
		map.put("l", 2);
		map.put("a", 1);
		map.put("f", 1);

		System.out.println(map);

		

	Set<Entry<String,Integer>> entrySet = map.entrySet();
	
	for(Entry<String,Integer> eachEntry:entrySet) {
		
		System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
	}
	boolean containsKey = map.containsKey(2);
	System.out.println(containsKey);
	boolean containsValue = map.containsValue("t");
	System.out.println(containsValue);
	
	Set<Integer> keySet = map.keySet();
	
	}

}
