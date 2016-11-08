import java.util.*;
public class JavaBookProblem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three integers: ");
		boolean error = true;
		int num1;
		int num2;
		int num3;
		
		do {
			try {
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("You have to enter integer numbers!");
				num1 = 0;
				num2 = 0;
				num3 = 0;
				sc.next();
			}
		} while (error);
		
		getMax(num1,num2,num3);
		sc.close();

	}
	private static void getMax(int a , int b, int c){
		System.out.println("Biggest number: " + Math.max(Math.max(a, b), c));
	}

}
