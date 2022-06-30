package singleton.car;

public class CarFactory {
	//싱글톤 패턴
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	//자동차공장 인스턴스 가져오기
	public static CarFactory getInstance() {
		return instance;
	}
	
	//차를 생성(만들기)
	public Car createCar() {
		Car car = new Car(); //차 객체 생성
		return car;
	}
}
