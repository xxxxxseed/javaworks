package thread;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//메인 스레드
		//"띵" 문자를 5번 출력 - 1초 간격 유지
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);	//1000ms -> 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//"띵" 소리를 5번 재생
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
