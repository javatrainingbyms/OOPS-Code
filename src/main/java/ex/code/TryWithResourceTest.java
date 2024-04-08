package ex.code;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceTest {

	public static void main(String[] args) {
		//no need to close the file (auto-closeable-try or try-with-resource)`
		try(FileReader fr=new FileReader("g:\\data\\inf.txt")){
			char ch[]=new char[50];
			fr.read(ch);
			String s=new String(ch);
			System.out.println(s);
		}catch(Exception ex) {
			//ex.printStackTrace();
			System.out.println(ex);
			//System.out.println(ex.toString());
		}
		
		/*
		//OLD-Approach
		FileReader fr=null;
		try {
			fr=new FileReader("g:\\data\\info.txt");
			char ch[]=new char[50];
			fr.read(ch);
			String s=new String(ch);
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
	}

}
