package operator;

public class Swap {

	public static void main(String[] args) {
		//변수긔 값 교환
		int x = 0, y = 1, temp = 0;
		
		//System.out.printf("교환 전\nx = %d, y = %d\n", x, y);
		System.out.println("교환 전");
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("-------------");
		
		temp = x; //temp = 0
		x = y; //x = 1
		y = temp; //y = 0

		System.out.printf("교환 후\nx = %d, y = %d\n", x, y);
	}

}
