class Rabbit {
	private String shape; 
	int xPos; 
	int yPos; 
	
	private void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;		
	}
}

class HouseRabbit extends Rabbit {
	String owner;
	void eatFeed() {
		System.out.println("집토끼가 사료를 먹습니다");
	}
}

public class Code08_05 {
	public static void main(String[] args) {		
		HouseRabbit hRabbit = new HouseRabbit();
		
		hRabbit.owner = "난생이";
		hRabbit.eatFeed();
		// hRabbit.shape = "삼각형"; // 오류 발생
		// hRabbit.move(100, 100);   // 오류 발생
		hRabbit.xPos = 100;
		hRabbit.yPos = 100;		
	}
}