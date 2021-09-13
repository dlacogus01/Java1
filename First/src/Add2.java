import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, sum;
		
		System.out.println("첫 번째 수 입력 : ");
		x = input.nextInt();
		System.out.println("두 번째 수 입력 : ");
		y = input.nextInt();

		sum = x + y;
		System.out.println(sum);
	}

}
