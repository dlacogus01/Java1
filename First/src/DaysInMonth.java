import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month, days, year;
		
		System.out.println("�⵵ �Է��Ͻÿ�. ");
		year = scn.nextInt();
		System.out.println("�� �Է��Ͻÿ� : ");
		month = scn.nextInt();
		
		switch (month) {
		case 4:
		case 6:
		case 8:
		case 11:
			days = 30; break;
		case 2:
			if(year%4==0 && year%100!=0 || year%400 == 0) {
				days = 29;
			}else {
				days = 28;
			}
			break;
		default:
			days = 31; break;
		}
		System.out.println(year + "��" + month + "����" + days + "�� �Դϴ�.");

	}

}