import java.util.*;
public class JavaBookProblem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one integer number: ");
		boolean error = true;
		int n;
		
		do {
			try {
				n = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("You have to enter integer number! ");
				n = 0;
				sc.next();
			}
		} while (error);
		
		printReversedNumber(n);
		sc.close();
	}
	private static void printReversedNumber(int number) {
		String reverse = Integer.toString(number);
		reverse = new StringBuffer(reverse).reverse().toString();
		System.out.println(reverse);
	}

}
