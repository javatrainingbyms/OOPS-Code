package str.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String,String> m1=new HashMap<>();
		Map<String,String> m2=new HashMap<>();
		Map<String,String> m3=new HashMap<>();

		m1.put("id","123"); 
		m1.put("prog","mba");
		
		m2.put("id","123"); 
		m2.put("prog","mca");

		m3.put("id","234"); 
		m3.put("prog","mba");
		
		
		List<Map<String,String>> list=Arrays.asList(m1,m2,m3);
		
		//System.out.println(list);
		
		
		Map<String,String> map=new HashMap<>();
		
		
		for(Map<String,String> mp:list) {
			String k=mp.get("id");
			String v=mp.get("prog");
			
			if(map.containsKey(k)) {
				map.put(k,map.get(k)+","+v);
			}else {
				map.put(k,v);
			}
		}
		System.out.println(map);
		
		
		
	}

}
