package thisexample;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		this("레토나", "국방색", 150);
	}
	
	Car(String model){
		//공통 실행 생성자 호출
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	//공통 실행 코드
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
