import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double area, radius;
		
		System.out.println("원의 반지름을 입력하시오 : ");
		radius = scn.nextDouble();
		
		area = Math.PI * radius * radius;
		
		System.out.println(area);

	}

}
