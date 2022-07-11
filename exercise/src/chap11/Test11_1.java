package chap11;

import java.util.HashMap;

public class Test11_1 {

	public static void main(String[] args) {

		//1. 4
		
		//2. hashCode(), equals()
		
		//3.
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
		
		//4.
		Member member = new Member("blue", "이파란");
		System.out.println(member.toString());
		
		//5. 4
		
		//6.
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
		System.out.println(str);
		
		//7.
		String str7 = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str7.indexOf("자바");
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str7 = str7.replace("자바", "Java");
			System.out.println("-->" + str7);
		}
		
		//8.
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		//9.
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		
	}

}
