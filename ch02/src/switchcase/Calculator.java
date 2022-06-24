package switchcase;

public class Calculator {

	public static void main(String[] args) {
		//사칙 연산
		int num1 = 10;
		int num2 = 2;
		char operator = '-'; //연산자
		int result = 0; //계산 결과
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류입니다.");
			break;
			
			
		} //switch 닫기
		System.out.println("결과 값은 " + result + "입니다.");
	} //main 닫기

}
