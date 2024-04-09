package ex.coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionOfCollection {

	public static void main(String[] args) {
		
		Map<String,Integer> sunshinePlacement=new HashMap<>();
		sunshinePlacement.put("engg", 50);
		sunshinePlacement.put("commerce",20);
		
		Map<String,Integer> buzzPlacement=new HashMap<>();
		buzzPlacement.put("engg", 40);
		buzzPlacement.put("commerce",30);
		
		Map<String,Integer> sommetPlacement=new HashMap<>();
		sommetPlacement.put("engg", 35);
		sommetPlacement.put("commerce",25);

		Map<String,Map<String,Integer>> pD=new HashMap<>();
		pD.put("sunshine", sunshinePlacement);
		pD.put("buzz", buzzPlacement);
		pD.put("sommet", sommetPlacement);
		
		System.out.println(pD.get("sommet"));
		
		/*
		List<Map<String,Integer>> placementData=new ArrayList<>();
		placementData.add(sunshinePlacement);
		placementData.add(buzzPlacement);
		placementData.add(sommetPlacement);
		
		for(Map<String,Integer> map:placementData) {
			System.out.println("Engg Data : "+map.get("engg"));
			System.out.println("Commerce Data : "+map.get("commerce"));
		}
		*/
		
		
		/*
		List<String> qaAutoEmp=new ArrayList<>();
		qaAutoEmp.add("gopi"); qaAutoEmp.add("harsh");
		
		List<String> qaManEmp=new ArrayList<>();
		qaManEmp.add("sanjay"); qaManEmp.add("piyush");
		
		
		List<List<String>> qaEmp=new ArrayList<>();
		qaEmp.add(qaManEmp); qaEmp.add(qaAutoEmp);
		
		
		for(List<String> list:qaEmp) {
			for(String item:list) {
				System.out.println(item);
			}
			System.out.println("_______________________");
		}
		*/
	}

}
