package csm;


public class Sample {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Main method invoked: ");

		while (true & i < 50) {
			try {
				System.out.println(++i);
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}
}
