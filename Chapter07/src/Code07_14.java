class Rabbit {
	private String shape; // 토끼 모양
	private int xPos; // X위치
	private int yPos; // Y위치
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String getShape() {
		return this.shape; 
	}
	
	public void setPosition(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}	
	
	public int getX() {
		return this.xPos;
	}
	
	public int getY() {
		return this.yPos;
	}
}

public class Code07_14 {
	public static void main(String[] args) {		
		Rabbit rabbit = new Rabbit();

		rabbit.setShape("흰토끼");
		rabbit.setPosition(100, 100);

		System.out.printf("토끼의 모양은 [%s] 입니다.\n", rabbit.getShape());
		System.out.printf("토끼의 위치는 (%d,%d) 입니다.\n", rabbit.getX(), rabbit.getY());
	}
}