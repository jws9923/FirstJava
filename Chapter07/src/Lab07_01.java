import java.util.Scanner;

class Rabbit {
	String shape; // 토끼 모양
	int xPos; // X위치
	int yPos; // Y위치
	
	void setPosition(int x, int y) {
		xPos = x;
		yPos = y;
	}
}

public class Lab07_01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rabbit rabbit;
		int userX, userY;
		
		rabbit = new Rabbit();
		rabbit.shape = "토끼";
		while (true) {
	        System.out.print("토끼가 이동할 X좌표  ==> ");
	        userX = s.nextInt();
	        System.out.print("토끼가 이동할 Y좌표  ==> ");
	        userY = s.nextInt();
	        
	        rabbit.setPosition(userX, userY);
	        System.out.printf("** 토끼의 현재 위치는 (%d, %d)입니다.\n", userX, userY);
		}
	}
}
