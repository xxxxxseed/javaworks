package anonymous.remotecontrol;

public class Anonymous {

	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};
	
	//메서드의 로컬 변수
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	
	//메서드의 매개값
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
