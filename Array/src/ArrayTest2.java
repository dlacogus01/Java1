import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		final int STUDENT_NUMBER = 5;
		int total = 0;
		int[] scores = new int[STUDENT_NUMBER];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번 학생의 점수 입력 : ");
			scores[i] = scn.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("평균 성적은 " + (double)total/STUDENT_NUMBER + "입니다.");
}
}
