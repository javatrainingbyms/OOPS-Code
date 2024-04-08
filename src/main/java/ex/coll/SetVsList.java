package ex.coll;

import java.util.Set;
import java.util.TreeSet;

public class SetVsList {

	public static void main(String[] args) {
		/*
		Person p1=new Person("gopi","indore","12345");
		Person p2=new Person("harsh","bhopal","23456");
		Person p3=new Person("manoj","dewas","34567");
		Person p4=new Person("anuj","mumbai","45678");
		List<Person> persons=new ArrayList<>();
		//Set<Person> persons=new HashSet<>();
		persons.add(p1); persons.add(p2); persons.add(p3); persons.add(p4);
		System.out.println(persons.get(1));
		for(Person person:persons) {
			System.out.println(person);
		}
		*/
		
		//Set<String> cities=new HashSet<>();
		//Set<String> cities=new LinkedHashSet<>();
		Set<String> cities=new TreeSet<>();
		cities.add("indore"); 
		cities.add("bhopal"); 
		cities.add("delhi"); 
		cities.add("pune"); 
		cities.add("chennai");
	
		System.out.println(cities);
		
	}

}
