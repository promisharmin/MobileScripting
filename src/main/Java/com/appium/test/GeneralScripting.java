package main.Java.com.appium.test;

public class GeneralScripting{
	
	
// Exercise#1 from General Scripting Section
	
	public static void main(String[] args) throws InterruptedException{
		
		reverseEverything("this is test");
		
		}
		
	public static void reverseEverything(String s) throws InterruptedException {
		
		String inputString = s ;
		String reverse = new StringBuffer(inputString).reverse().toString();
		System.out.println(reverse);
	
	}
}

