package chap02;

public class Test2 {

	public static void main(String[] args) {

		//1.
		byte byteValue = 10;
		char charValue = 'A';
		//int intValue = byteValue;
		int intValue = charValue;
		//short shortValue = charValue;
		double doubleValue = byteValue;
		
		//4.
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
		short result1 = (short)(s1 + s2);
		System.out.println(result1);
		int result2 = i1 + i2;
		System.out.println(result2);
		
		//5.
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		//6. 7.
		int x = 5;
		int y = 2;
		double result3 = (double)x / y;
		System.out.println(result3);
		
		//8.
		double var1 = 3.5;
		double var2 = 2.7;
		int result4 = (int)(var1 + var2);
		System.out.println(result4);
		
		//9.
		long var9_1 = 2L;
		float var9_2 = 1.8f;
		double var9_3 = 2.5;
		String var9_4 = "3.9";
		int result9 = (int)(var9_1 + var9_2 + var9_3 + Double.parseDouble(var9_4));
		System.out.println(result9);
		
		//10.
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//11.
		byte value11_1 = Byte.parseByte("10");
		int value11_2 = Integer.parseInt("1000");
		float value11_3 = Float.parseFloat("20.5");
		double value11_4 = Double.parseDouble("3.14159");
		
		
		
	}

}
