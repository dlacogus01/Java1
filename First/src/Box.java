import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double w, h, area, perimeter;
		
		System.out.println("사각형의 높이를 입력하시오 ");
		h = scn.nextDouble();
		System.out.println("사각형의 너비를 입력하시오 ");
		w = scn.nextDouble();
		
		area = w * h;
		perimeter = 2.0 * (w + h);
		
		System.out.println("사각형의 면적은 " + area);
		System.out.println("사각형의 둘레는 " + perimeter);

	}

}
