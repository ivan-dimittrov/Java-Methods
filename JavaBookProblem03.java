import java.util.Random;

public class JavaBookProblem03 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(990) + 10;

		System.out.println("Number: " + n);
		System.out.println("Last digit: " + getLastDigitAsWord(n));
	}

	private static String getLastDigitAsWord(int num) {
		int lastDigit = num % 10;
		String number = "";
		switch (lastDigit) {
		case 0:
			number = "Zero";
			break;
		case 1:
			number = "One";
			break;
		case 2:
			number = "Two";
			break;
		case 3:
			number = "Three";
			break;
		case 4:
			number = "Four";
			break;
		case 5:
			number = "Five";
			break;
		case 6:
			number = "Six";
			break;
		case 7:
			number = "Seven";
			break;
		case 8:
			number = "Eight";
			break;
		case 9:
			number = "Nine";
			break;

		default:
			break;
		}
		return number;
	}
}
