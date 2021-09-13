import java.util.Arrays;
import java.util.Scanner;

public class SortExample {
	public static void main(String[] args) {
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("정수 입력 :");
			numbers[i] = scn.nextInt();
		}
		System.out.println("초기에 생성된 배열");
		for (int i : numbers) {
			System.out.println(i + " ");
		}
		System.out.println();
		Arrays.sort(numbers);
		System.out.println("정렬한 배열");
		for (int i : numbers) {
			System.out.println(i + " ");
		}
		
	}
}
