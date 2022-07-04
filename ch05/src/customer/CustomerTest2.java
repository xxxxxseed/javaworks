package customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		//매개변수 가진 생성자로 객체 생성
		Customer lee = new Customer(10010, "이순신");
		//VIPCustomer king = new VIPCustomer(10020, "세종대왕", 1446);
		//부모 클래스로 객체 생성 - 자동 타입 변환(형변환)
		Customer king = new VIPCustomer(10020, "세종대왕", 1446);
		
		//상품 구매
		int price = 10000;
		int leePrice = lee.calcPrice(price);
		int kingPrice = king.calcPrice(price);
		
		
		//고객 정보
		System.out.println(lee.showCustomerInfo());
		System.out.println(king.showCustomerInfo());
		
		//지불 비용
		System.out.println(lee.getCustomerName() + "님의 지불해야 하는 금액은 "
				+ leePrice + "원 입니다.");
		System.out.println(king.getCustomerName() + "님의 지불해야 하는 금액은 "
				+ kingPrice + "원 입니다.");

	}

}
