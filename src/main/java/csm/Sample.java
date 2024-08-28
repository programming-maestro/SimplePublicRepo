package csm;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("Main method invoked: ");
		try {
			System.out.println(++i);
			Thread.sleep(10000);
		} catch (Exception e) {
		}

	}
}
