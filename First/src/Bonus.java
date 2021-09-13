import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int TARGETSALES = 1000;
		int mySales, bonus;
		String result;
		
		System.out.println("실적을 입력하시오(단위 만원) :");
		mySales = scn.nextInt();
		
		if(mySales - TARGETSALES > 0) {
			result = "실적 달성";
			bonus = (mySales - TARGETSALES) / 10;
			
		}
		else {
			result = "실적 달성 못함";
			bonus = 0;
		}
			System.out.println(result + "보너스 = " + bonus );
	}

}
