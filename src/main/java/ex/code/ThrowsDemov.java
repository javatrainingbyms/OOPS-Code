package ex.code;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemov {

	public static void readFile(String fileName) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			try {
				fr = new FileReader("g:/data/default.txt");
			} catch (FileNotFoundException e1) {
				System.out.println("Even Default Is Also Not Present");
			}
		}
		char ch[] = new char[50];
		fr.read(ch);
		String str = new String(ch);
		System.out.println(str);
	}

	public static void main(String[] args) throws Exception {
		readFile("g:/data/info.txt");

	}

}
