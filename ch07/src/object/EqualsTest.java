package object;

public class EqualsTest {

	public static void main(String[] args) {

		String color1 = new String("빨강");
		String color2 = new String("빨강");
		
		//메모리 주소 비교
		System.out.println(color1 == color2); //false
		
		//저장된 문자열 값 비교
		System.out.println(color1.equals(color2));
		
		Book book1 = new Book(12, "개미");
		Book book2 = new Book(12, "개미");
		
		//메모리 주소 비교
		System.out.println(book1 == book2); //false
		
		//저장된 문자열 값 비교
		System.out.println(book1.equals(book2)); //true
		
		//hashCode() 테스트
		System.out.println(color1.hashCode());
		System.out.println(color2.hashCode());
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
