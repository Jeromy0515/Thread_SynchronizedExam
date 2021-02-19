package timer;

import java.util.Scanner;

public class Timer {
	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in);
		
		System.out.println("Start measuring time");
		
		long startTime = System.currentTimeMillis();
		
		sleep(500);
		
		System.out.println("Enter \"Stop\"");
		
		while(!scnner.nextLine().equals("Stop")) {
			System.out.println("Not match \"Stop\"");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Elapsed Time:"+(double)(endTime - startTime)/1000);
		
	}
	
	
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
