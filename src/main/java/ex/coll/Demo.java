package ex.coll;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	
	public static int count(String cities[]) {
		int count=0;
		for(String city:cities) {
			if(city.startsWith("a")) {
				count++;
			}
		}
		return count;
	}
	public static int[] calc(int n) {
		int square= n*n;
		int cube = square*n;
		int data[]= {square,cube};
		return data;
		
	}
	public static void main(String[] args) {
		
		int i=0;
		//String names[]=new String[50];
		ArrayList<String> names=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			String s=sc.next();
			
			if(s.equals("exit"))break;
			names.add(s);
			i++;
		}
		for(String name:names) {
			System.out.println(name);
		}
		
		
		/*
		String cities[]= {"delhi","agra","bhopal","ahmedabad","ujjain"};
		int count=count(cities);
		System.out.println(count);
		*/
		
		/*
		int result[]=calc(5);
		System.out.println(result[0]);
		System.out.println(result[1]);
		*/
	}
}
