package chap09;

public class Test9_1 {

	public static void main(String[] args) {
		//1. O, O, O, X
		
		//2. 3
		
		//3.
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
		//4.
		/*Chatting chat = new Chatting();
		chat.startChat("홍길동");*/
		
		//5.
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}

}
