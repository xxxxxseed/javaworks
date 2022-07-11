package chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test11_2 {

	public static void main(String[] args) {
		
		//1.
		Date now1 = new Date();
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		
		String strNow = sdf.format(now1);
		System.out.println(strNow);
		
		//2.
		Calendar now2 = Calendar.getInstance();
		
		int year = now2.get(Calendar.YEAR);
		int month = now2.get(Calendar.MONTH) + 1;
		int day = now2.get(Calendar.DAY_OF_MONTH);
		
		int week = now2.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		int hour = now2.get(Calendar.HOUR_OF_DAY);
		int minute = now2.get(Calendar.MINUTE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 "
				+ strWeek + "요일 " + hour + "시 " + minute + "분");
		
		
	}

}
