package classpart;

public class Calculator {
	
	//메서드
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	public int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	public double div(int n1, int n2) {
		return n1 / (double)n2; //계산은 기본 int이므로 double로 자동 형변환
	}
}
