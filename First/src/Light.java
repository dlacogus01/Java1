public class Light {

	public static void main(String[] args) {
		long LightSpeed, distance;
		
		LightSpeed = 300000;
		distance = LightSpeed * 365L * 24 * 60 * 60;
		
		System.out.println("빛이 1년 동안 가는 거리" + distance);
	}
}
