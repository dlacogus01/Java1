
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		int[]s = new int[10];
		Scanner scn = new Scanner(System.in);
		int value, index = -1;
		
		for (int i = 0; i < s.length; i++) {
			System.out.println((i+1) + "번째 수 입력 : ");
			s[i] = scn.nextInt();
		}
		System.out.println("배열에서 탐색할 값 입력 : ");
		value = scn.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == value)
				index = i;
		}
		if(index == -1)
		System.out.println("s배열에는 " + value + "값이 없습니다.");
		else
			System.out.println("s배열에는 " + value + "값이 s[" + index + "]에 있습니다.");
	}
}
