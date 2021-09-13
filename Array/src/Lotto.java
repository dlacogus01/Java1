
public class Lotto {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.println((int)(Math.random()*45+1) + ", ");
			if(i < 5)
				System.out.println(", ");
			else
				System.out.println();
		}

	}

}