import java.util.*;
public class JavaBookProblem05 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[]{4,54,5,6,8,4,34,32,12,76,4,19};
		int n = r.nextInt(arr.length);
		
		System.out.println(Arrays.toString(arr));
		printBiggerOrSmaller(n, arr);
	}

	private static void printBiggerOrSmaller(int position , int[] numbers) {
		if (position < numbers.length - 1 && position > 0) {
			if (numbers[position] > numbers[position + 1] && 
					numbers[position] > numbers[position - 1]) {
				System.out.printf("Number at %d position is bigger than his neighbours",position);
			}else {
				if (numbers[position] < numbers[position + 1] && 
						numbers[position] < numbers[position - 1]) {
					System.out.printf("Number at %d position is smaller than his neighbours",position);
				}else if (numbers[position] < numbers[position + 1]) {
					System.out.printf("Number at %d position is smaller than his right neighbour",position);
				}else if(numbers[position] < numbers[position - 1]) {
					System.out.printf("Number at %d position is smaller than his left neighbour",position);
				} 
			}
		}
		else if(position == 0 || position == numbers.length -1){
			if (position == 0) {
				if (numbers[position] > numbers[position + 1]) {
					System.out.printf("Number at %d position is bigger than his neighbour",position);
				}else {
					System.out.printf("Number at %d position is smaller than his neighbour",position);
				}
			}else {
				if (numbers[position] > numbers[position - 1]) {
					System.out.printf("Number at %d position is bigger than his neighbour",position);
				}else {
					System.out.printf("Number at %d position is smaller than his neighbour",position);
				}
			}
		}
	}
}
