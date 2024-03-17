class Rabbit {
	private String shape; // 토끼 모양
	private int xPos; // X위치
	private int yPos; // Y위치
	
	void setPosition(int x, int y) {
		xPos = x;
		yPos = y;
	}	
}

public class Code07_12 {
	public static void main(String[] args) {		
		Rabbit rabbit = new Rabbit();

		rabbit.setPosition(100, 100);
		// rabbit.xPos = 200;    
	}
}