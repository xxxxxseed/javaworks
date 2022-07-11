package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		
		//LocalDate, LocalTime 클래스 사용
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜 / 시간 형식 설정
		DateTimeFormatter myFormat =
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
				
		String formattedDate = now.format(myFormat);
		System.out.println(formattedDate);
	}

}
