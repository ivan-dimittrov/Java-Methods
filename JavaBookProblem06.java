public class JavaBookProblem06 {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 3, 5, 6, 8, 4, 34, 32, 12, 76, 4, 19 };
		int result = getBiggerThanNeighbors(arr);

		if (result != -1) {
			System.out.println("First bigger number than his neighbours is: "
					+ arr[result]);
			System.out.println("Position: " + result);
		} else {
			System.out.println("Error " + result);
		}
	}

	private static int getBiggerThanNeighbors(int[] numbers) {
		int position = 0;
		boolean checkNum = false;
		
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i + 1] && numbers[i] > numbers[i - 1]) {
				position = i;
				checkNum = true;
				break;
			}
		}
		if (checkNum) {
			return position;
		}
		return -1;
	}
}
