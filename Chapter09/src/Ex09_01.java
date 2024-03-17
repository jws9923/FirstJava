import java.awt.Color;
public class Ex09_01 {
	public static void main(String[] args) {		
		int TURTLE_NUMBER = 50;
		int WIDTH = 500, HEIGHT = 500;		
		
		Turtle turtle = new Turtle();
		turtle.speed(100);
		turtle.outlineColor("white");
		turtle.setCanvasSize(WIDTH+100, HEIGHT+100);
		
		// 거북이X, 거북이Y, 거북이 크기, R, G, B 
		int[][] turtleAry = new int[TURTLE_NUMBER][6];
		
		for (int i=0; i<TURTLE_NUMBER; i++) {
			turtleAry[i][0] = (int)(Math.random() * WIDTH - WIDTH/2); // X위치
			turtleAry[i][1] = (int)(Math.random() * HEIGHT - HEIGHT/2); // Y위치
			turtleAry[i][2] = (int)(Math.random() * 100); // 거북이 크기
			turtleAry[i][3] = (int)(Math.random() * 256); // Red
			turtleAry[i][4] = (int)(Math.random() * 256); // Green
			turtleAry[i][5] = (int)(Math.random() * 256); // Blue			
		}		
		
		int x, y, size, r, g, b;
		for (int i=0; i<TURTLE_NUMBER; i++) {
			x =  turtleAry[i][0];
			y = turtleAry[i][1];
			size = turtleAry[i][2];
			r = turtleAry[i][3];
			g = turtleAry[i][4];
			b = turtleAry[i][5];

			turtle.fillColor(new Color(r, g, b));
			turtle.penColor(new Color(r, g, b));
			
			turtle.shapeSize(size,size);
			turtle.down();
			turtle.setPosition(x, y);
			turtle.stamp();
			
			turtle.up();
			turtle.setPosition(0,0);			
		}		
	}
}
