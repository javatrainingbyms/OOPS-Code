package ex.coll;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		//you wish to store names of ministers in a collection
		
		
		Map<String,String> map=new HashMap<>();
		map.put("pm", "Modi");
		map.put("hm", "Shah");
		map.put("fm", "Nirmala");
		
		System.out.println(map);
		
		String value=map.get("hm");
		System.out.println(value);
		
		/*
		List<String> list=new ArrayList<>();
		list.add("Modi");
		list.add("Shah");
		list.add("Singh");
		list.add("Nirmala");
		System.out.println(list);
		*/
	}
}
