import java.math.*;
import java.util.Random;

public class JavaBookProblem08 {

	public static void main(String[] args) {
		Random r = new Random();
		printNFact(r.nextInt(99) + 1);
	}

	private static void printNFact(int num) {
		BigInteger result = BigInteger.ONE;
		for (int i = num; i >= 1; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.printf("%d! = %d", num, result);
	}

}
