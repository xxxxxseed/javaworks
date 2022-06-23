package loopexample;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		//커피 자동판매기
		Scanner sc = new Scanner(System.in);
		
		int coffee = 5; //커피 총 수량
		while(true) {
			System.out.println("돈을 넣어주세요: ");
			int money = sc.nextInt();
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee -= 1;
			}else if(money > 500) {
				System.out.println("거스름돈 " + (money - 500) + "원을 돌려주고 커피가 나옵니다.");
				coffee -= 1;
			}else {
				System.out.println("돈을 돌려주고 커피는 나오지 않습니다.");
			}
			System.out.println("남은 커피의 양은 " + coffee + "개입니다.");
			
			if(coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지 합니다.");
				break;
			}
		}
		sc.close();
	}
}
