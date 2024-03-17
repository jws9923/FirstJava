class Dice {
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}	
	public int getNumber() {
		return this.number;
	}
}

public class Lab07_02 {
    public static void main(String[] args) {
        int count = 0;
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();;
        Dice dice3 = new Dice();
        
        while( true ) {
            count ++;
            dice1.setNumber((int)(Math.random()*6 + 1));
            dice2.setNumber((int)(Math.random()*6 + 1));
            dice3.setNumber((int)(Math.random()*6 + 1));
            
            if ((dice1.getNumber() == dice2.getNumber()) && 
            		(dice2.getNumber() == dice3.getNumber()))
                break;
        }
        System.out.printf("3개 주사위는 모두 %d 입니다.\n", dice1.getNumber());
        System.out.printf("같은 숫자가 나오기까지 %d번 던졌습니다.\n", count);
    }
}
