import java.util.*;
public class JavaBookProblem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		
		String name = sc.next();
		printName(name);
		sc.close();
	}
	private static void printName(String str){
		System.out.printf("Hello %s!",str);
	}

}
