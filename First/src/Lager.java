import java.util.Scanner;
public class Lager {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x, y, max;
		
		System.out.println("첫 번재 정수 : ");
		x = scn.nextInt();
		System.out.println("두 번재 정수 : ");
		y = scn.nextInt();

//		if(x>y) {
//			max = x;
//		}
//		else {
//			max = y;
//		}
		max = ( x > y)?x:y;
		
		System.out.println("큰 수는" + max);
	}
}
