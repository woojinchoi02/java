package hello;


import java.util.*;
public class hello {
	
	public static  void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(101);
		int a = 0;
		int b = 0;
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("정답을 추측하여 보시오: ");
			a = input.nextInt();
			b = b + 1;
			if(a == i) {
				System.out.println("축하합니다. 시도횟수=" +  b);
				break;
			}
			else if(a > i) {
					System.out.println("Low" );
				}
			else if(a < i){
				System.out.println("High" );
			}
		}
			 
	}
}

