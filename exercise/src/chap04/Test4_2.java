package chap04;

public class Test4_2 {

	public static void main(String[] args) {
		
		//2.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
		
		//3.
		while(true) {
			
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.printf("(%d, %d)\n", dice1, dice2);
		
		if(dice1 + dice2 == 5)
			break;
		}
		
		System.out.println("==========================");
		//4.
		for(int x = 1; x <=10; x++) {
			for(int y = 1; y <= 10; y++) {
				if(4*x + 5*y == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
		//5.
		int num = 7;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
//				if() {
//					
//				}
				System.out.print("@");
			}
			System.out.println();
		}
		
		
	}

}
