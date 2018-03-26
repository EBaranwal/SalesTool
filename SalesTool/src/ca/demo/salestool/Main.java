package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data=new SalesData();
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE");
		System.out.println("THIS APP SHOW SALES DATA");
		
		
		System.out.println("Test 1");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World!!");
			if(i==3)
				break;
		}
		System.out.println("My First Commit");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("In Master");
		}
	}
}
