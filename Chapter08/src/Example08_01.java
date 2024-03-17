class Rabbit {
	protected int xPos; 
	protected int yPos; 
	
	public void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;		
	}
}

class HouseRabbit extends Rabbit {
	
}

public class Example08_01 {
	public static void main(String[] args) {
		HouseRabbit hRabbit = new HouseRabbit();
		hRabbit.move(100, 100);
		// hRabbit.xPos = 200;    //외부에서 사용하면 오류 발생
	}
}