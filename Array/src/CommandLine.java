
public class CommandLine {
	public static void main(String[] args) {
		String a = "abcd";
		String b= "abcd";
		String c = "def";
		String d = new String("abcd");
		
		if(args.length > 0){
			if(args[0].equals("-h"))
				System.out.println("Help");
			else {
				for (int i = 1; i < args.length; i++) {
					System.out.println(args[i]);
				}
			}
			
		}else {
			System.out.println("������ �� �ڿ� �ƹ� �͵� ���� �����߳׿�.");
		}
	}
}
