package hello;
public class Dice {
	int value ;
	void Dice() {
		value = 0;
	}
	void roll() {
		value = (int)(Math.random()*10)%6 + 1;
	}
	void setValue(int value){
		this.value = value;
	}
	int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int cnt = 0;
		while(true) {
			d1.roll();
			d2.roll();
			System.out.println(d1.getValue() + " " + d2.getValue());
			cnt++;
			if(d1.getValue() + d2.getValue() == 2) {
				System.out.println("(1, 1)이 나오는데 걸린 횟수 = "+cnt);
				break;
				
			}
			else {continue;}
	}
}

}
