package Chap2;

public class Ex01 {
	public static void main(String[] args) {
		boolean happy = false;
		boolean sad = true;
		if (happy)
			System.out.println("I am happy.");
		// Usually put the conditional code into a block.
		if (sad) {
			// You will not see this.
			System.out.println("The variable sad is true.");
		}
	}
}
