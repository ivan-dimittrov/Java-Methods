import java.util.Random;

public class JavaBookProblem04 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[] { 4, 5, 6, 5, 5, 4, 32, 56, 43, 2, 7, 7 };
		int number = r.nextInt(arr.length);

		System.out.println("Number " + arr[number] + " occurs "
				+ numberSearch(arr[number], arr) + " times");
	}

	private static int numberSearch(int searchedNum, int[] numbers) {
		int count = 0;
		for (int i : numbers) {
			if (searchedNum == i) {
				count++;
			}
		}
		return count;
	}

}
