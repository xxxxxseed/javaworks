package thread;

//스레드 만드는 방법 - Thread 클래스 상속
public class ThreadA extends Thread{
	//setName(), getName() Thread의 메서드
	public ThreadA() {
		setName("ThreadA");	//스레드 이름 설정
	}

	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
	}
	
	
}
