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
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		
		int day = now2.get(Calendar.DAY_OF_MONTH);
		String strDay = (day < 10) ? ("0" + day) : ("" + day);
		
		/*int week = now2.get(Calendar.DAY_OF_WEEK);
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
		}*/
		
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now2.get(Calendar.DAY_OF_WEEK);
		String strWeek = days[dayOfWeek - 1];
		
		int hour = now2.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour < 10) ? ("0" + hour) : ("" + hour);
		
		int minute = now2.get(Calendar.MINUTE);
		String strMinute = (minute < 10) ? ("0" + minute) : ("" + minute);
		
		System.out.println(year + "년 " + strMonth + "월 " + strDay + "일 "
				+ strWeek + "요일 " + strHour + "시 " + strMinute + "분");
		
		
	}

}
