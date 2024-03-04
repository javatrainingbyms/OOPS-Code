package str.demo;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter File Name : ");
		String fileName=sc.next();
		String fileType="";
		fileName=fileName.toLowerCase();
		if(fileName.endsWith("jpg")) {
			fileType="Image";
		}else if(fileName.endsWith("xls")) {
			fileType="Excel";
		}else if(fileName.endsWith("doc")) {
			fileType="Word";
		}else {
			fileType="Unknown";
		}
		System.out.println("File Type : "+fileType);
		
		
		/*
		System.out.println("Enter First Name : ");
		String name1=sc.next();
		System.out.println("Enter Second Name : ");
		String name2=sc.next();
	
		//int n=name1.compareTo(name2);
		int n=name1.compareToIgnoreCase(name2);
		if(n>0) {
			System.out.println(name2);
			System.out.println(name1);
		}else {
			System.out.println(name1);
			System.out.println(name2);
		}
		*/
		
		
		
	}

}
