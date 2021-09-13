
import java.util.Scanner;

public class GetMin {
	public static void main(String[] args) {
//		int s[] = {12, 3, 19, 6, 8, 4, 5, 1, 6, 10};
		int s[] = new int[10];
		Scanner scn = new Scanner(System.in);
		
		int minimum, maxmum;
		for (int i = 0; i < s.length; i++) {
			System.out.println("10개 중에 "+(i+1)+"번째 수 입력 : ");
			s[i] = scn.nextInt();
		}
		
		minimum = s[0];
		maxmum = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(minimum > s[i])
				minimum = s[i];
			if(maxmum < s[i])
				maxmum = s[i];
		}
		System.out.println("최소값 = " + minimum + "최대값" + maxmum);
		
	}
}