package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		//사람 객체 생성
		Person p1 = new Person("안산", 10000);
		Person p2 = new Person("류현진", 5000);
		
		//버스 1대 생성
		Bus bus100 = new Bus(100);
		
		//지하철 생성
		Subway subwayGreen = new Subway("2호선");
		
		p1.takeBus(bus100);
		p1.showInfo();
		p2.takeBus(bus100);
		p2.showInfo();
		
		p1.takeSubway(subwayGreen);
		p1.showInfo();
		p2.takeSubway(subwayGreen);
		p2.showInfo();
		
		bus100.showInfo();
		subwayGreen.showInfo();

	}

}
