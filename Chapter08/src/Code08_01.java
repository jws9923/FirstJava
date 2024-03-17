class Rabbit {
	String shape; 
	int xPos; 
	int yPos; 
	static int count; // 생성한 토끼 수
	
	Rabbit() {
		count++;
	}
}

public class Code08_01 {
	public static void main(String[] args) {		
		System.out.println("객체를 생성 전의 총 토끼 수 ==>" + Rabbit.count);
		
		Rabbit rabbit1 = new Rabbit();
		System.out.println("토끼 객체1 생성 후, 총 토끼 수 ==>" + Rabbit.count);
		
		Rabbit rabbit2 = new Rabbit();
		System.out.println("토끼 객체2 생성 후, 총 토끼 수 ==>" + Rabbit.count);
	}
}