package chap05;

import java.util.Scanner;

public class Test5_2 {

	public static void main(String[] args) {
		//1.
		int[] array1_1 = {1, 2, 3};
		int[] array1_2;
		//array1_2 = {1, 2, 3};
		int[] array1_3 = new int[3];
		int[][] array1_4 = new int[3][2];
		
		//2. 3
		boolean bool = false;
		
		//3.
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		System.out.println(array.length); //3
		System.out.println(array[2].length); //5
		
		//4.
		int max = 0;
		int[] array4 = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < array4.length; i++) {
			if(max < array4[i]) {
				max = array4[i];
			}
		}
		System.out.println("max: " + max);
		
		//5.
		int[][] array5 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		//6.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}else if(selectNo == 4) {
				int max6 = 0;
				int sum6 = 0;
				double avg6 = 0;
				for(int i = 0; i < scores.length; i++) {
					max6 = (max6 < scores[i]) ? scores[i] : max6;
					sum6 += scores[i];
				}
				avg6 = (double) sum6 /studentNum;
				System.out.println("최고 점수: " + max6);
				System.out.println("평균 점수: " + avg6);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		
		System.out.println("프로그램 종료");
		scanner.close();
		
		
	}

}
