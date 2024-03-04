package str.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
//@Setter
@ToString
public class Demo {
	private int x;
	private int y;
	public String name="MANOJ";
	public Demo(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Demo(Demo tmp) {
		this.x=tmp.x;
		this.y=tmp.y;
	}
	
	public static void main(String[] args) {
		
		String browser="firefox";
		
		switch(browser) {
		case "chrome":
			System.out.println("Testing On Chrome...");
		break;
		case "ie":
			System.out.println("Testing On IE...");
		break;
		case "firefox":
			System.out.println("Testing On Firefox...");
		break;
		}
		
		/*
		Demo d1=new Demo(10,20);
		System.out.println(d1);
		
		Demo d2=new Demo(d1);
		System.out.println(d2);
		*/
		
	}
}
