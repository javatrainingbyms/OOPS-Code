package ex.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<>();
		list.add(50); list.add(20); list.add(25); list.add(15); list.add(22); list.add(100); list.add(44);

		for(Integer item:list) {
			System.out.println(item);
		}
		System.out.println("____________________");
		Collections.sort(list);
		for(Integer item:list) {
			System.out.println(item);
		}
		int idx=Collections.binarySearch(list, 15);
		if(idx>=0) {
			System.out.println("Element is on : "+idx+" index");
		}else {
			System.out.println("Item not found...!");
		}
	}

}
