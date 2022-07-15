package thread;

//스레드 만드는 방법 - Thread 클래스 상속
public class ThreadB extends Thread{

	@Override
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
	}
	
	
}
