import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int score, number;
		char grade;
		
		System.out.println("정수를 입력하세요. ");
		score = inp.nextInt();
		
		number = score / 10;
		switch (number) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F'; break;
		}
		System.out.println(score + "는" + grade + "입니다.");
	}

}
