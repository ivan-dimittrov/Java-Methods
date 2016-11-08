import java.util.*;
public class JavaBookProblem09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Reverse number | 2 - Calculate the average of a given row of numbers"
				+ " | 3 - Calculate a * x + b = 0");
		System.out.print("Choose option: ");
		
		int menuOption = sc.nextInt();
		
		if (menuOption > 3 || menuOption < 1) {
			System.out.println("Invalid menu option");
		}else {
			switch (menuOption) {
			case 1:
				System.out.print("Enter the number you want to reverse: ");
				reverseNumber(sc.nextInt());
				break;
			case 2:
				System.out.print("Enter sequence of numbers: ");
				sc.nextLine();
				String[] rowOfNumbers = sc.nextLine().split(" ");
				getAverage(rowOfNumbers);
				break;

			default:
				System.out.print("Enter number a: ");
				double a = sc.nextInt();
				System.out.print("Enter number b: ");
				double b = sc.nextInt();
				getX(a,b);
				break;
			}
		}
		sc.close();
	}
	private static void reverseNumber(int number) {
		if (number < 0) {
			System.out.println("Invalid number! The number must be positive");
		}else {
			String reverseNum = Integer.toString(number);
			reverseNum = new StringBuffer(reverseNum).reverse().toString();
			System.out.println("Reversed number: " + reverseNum);
		}
	}
	
	private static void getAverage(String[] numbers) {
    	double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
		}
		double avarege = (sum / numbers.length);
		System.out.println("Result: " + avarege);
	}
    
	private static void getX(double a , double b) {
    	if (a == 0) {
			System.out.println("Invalid number a");
		}else {
		 	double x = 0;
	    	if (b > 0) {
				x = (b / a) * -1;
			}else {
				 b *= - 1;
				 x = b / a;
			}
			System.out.println("X = " + x);
		}
	}
}
