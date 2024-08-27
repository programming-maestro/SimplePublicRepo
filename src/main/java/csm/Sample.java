package csm;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Write anything: ");
		String s = input.next();
		System.out.println("This was the command line argument: " + s);
	}
}
