package hello;
import java.util.*;
public class happy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y ;
		int a = 0;
		char[][] tik = {
				{' ',' ',' '},
				{' ',' ',' '},
				{' ',' ',' '}
		};
		Loop1 :
		while(true) {
			System.out.println(tik[0][0] + "  ㅣ" + tik[0][1] + "  ㅣ" + tik[0][2]);
			System.out.println("---ㅣ---ㅣ---");
			System.out.println(tik[1][0] + "  ㅣ" + tik[1][1] + "  ㅣ" + tik[1][2]);
			System.out.println("---ㅣ---ㅣ---");
			System.out.println(tik[2][0] + "  ㅣ" + tik[2][1] + "  ㅣ" + tik[2][2]);
			for(int i = 0; i<3; i++) {
				if(tik[i][0] ==  'O' && tik[i][1] == 'O' && tik[i][2] == 'O') {
					System.out.println("O 승리");
					break Loop1;
				}
				else if(tik[i][0] ==  'X' && tik[i][1] == 'X' && tik[i][2] == 'X') {
					System.out.println("X 승리");
					break Loop1;
				}					
			}
			for(int i = 0; i<3; i++) {
				if(tik[0][i] ==  'O' && tik[1][i] == 'O' && tik[2][i] == 'O') {
					System.out.println("O 승리");
					break Loop1;
					}
				else if(tik[0][i] ==  'X' && tik[1][i] == 'X' && tik[2][i] == 'X') {
					System.out.println("X 승리");
					break Loop1;
					}	
				}
					
			if(tik[0][0] ==  'O' && tik[1][1] == 'O' && tik[2][2] == 'O') {
				System.out.println("O 승리");
				break Loop1;
				}
			else if(tik[0][0] ==  'X' && tik[1][1] == 'X' && tik[2][2] == 'X') {
				System.out.println("X 승리");
				break Loop1;
			}
			else if(tik[0][2] ==  'O' && tik[1][1] == 'O' && tik[2][0] == 'O') {
				System.out.println("O 승리");
				break Loop1;
			}
			else if(tik[0][2] ==  'X' && tik[1][1] == 'X' && tik[2][0] == 'X') {
				System.out.println("X 승리");
				break Loop1;
			}	
			System.out.print("다음 수의 좌표를 입력하시오: ");
			x = sc.nextInt();
			y = sc.nextInt();
			if(tik[x][y] != ' ') {
				System.out.println("이미 입력된 자리이므로 붕가능합니다.");
				continue;
			}
			a = a + 1;
			if(a % 2 == 1) {
				tik[x][y] = 'O';
			}
			else {
				tik[x][y] = 'X';
			}
			System.out.println("");
		}
	}
}
