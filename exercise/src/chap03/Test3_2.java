package chap03;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		//1.
		byte b = 5;
		b = (byte) -b; //-b가 -5가 되며서 int형으로 바뀜
		int result = 10 / b;
		System.out.println(result);
		
		//2.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //11 + 20
		System.out.println(z); //31
		System.out.println(y); //19
		
		//3.
		boolean stop = false;
		int i = 0;
		while (!stop){
			i++;
			System.out.println("실행");
			if(i > 10)
				break;
		}
		
		//4.
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (534 / 30);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = (534 % 30);
		System.out.println(pencilsLeft);
		
		//5.
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
		//6.
		int value = 356;
		System.out.println(value - value % 100);
		
		//7.
		float var7_1 = 10f;
		float var7_2 = var7_1 / 100;
		System.out.println(var7_2);
		if(var7_2 == 0.1f) {
			System.out.println("10%입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		}
		
		//8.
		//사다리꼴 넓이 = (윗변 + 아랫변) * 높이 / 2
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / (double)2;
		System.out.println(area);
		
		//9.
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("첫 번째 수: ");
		double n1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("두 번째 수: ");
		double n2 = Double.parseDouble(sc.nextLine());
		
		if(n2 != 0.0) {
			System.out.println("결과: " + n1/n2);
		}else {
			System.out.println("결과: 무한대");
		}*/
		
		//10.
		int var10_1 = 10;
		int var10_2 = 3;
		int var10_3 = 14;
		double var10_4 = var10_1 * var10_1 * Double.parseDouble(var10_2 + "." + var10_3);
		System.out.println("원의 넓이:" + var10_4);
		
		//11.
		/*System.out.print("아이디:");
		String name = sc.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}*/
		
		//12.
		int x12 = 10;
		int y12 = 5;
		System.out.println((x12 > 7) && (y12 <= 5));
		System.out.println((x12 % 3 == 2) || (y12 % 2 != 1));
		
		//13.
		int value13 = 0;
		
		value13 = value13 + 10;
		value13 += 10;
		value13 = value13 - 10;
		value13 -= 10;
		value13 = value13 * 10;
		value13 *= 10;
		value13 = value13 / 10;
		value13 /= 10;
		
		//14.
		int score = 85;
		String result14 = (!(score > 90)) ? "가" : "나";
		System.out.println(result14);
		
		sc.close();
	}

}
