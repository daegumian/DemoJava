package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//getTime()!!
		
		//1970/1/1 0시 기준이로 밀리세컨으로 변경 => 날짜연산
		long millis = date.getTime();
		System.out.println(millis);
		
		//현재시간 + 1초 (1000밀리세컨즈가 = 1초)
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		System.out.println(date2);
		
		long millis2 = date2.getTime();
		System.out.println(millis2 - millis); //시간차 
		
		
		//SimpleDateFormat
		//사람이 보기편한 날짜로 변환 (년 월 일 요일 시:분:초) 기억~!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		String now = sdf.format(date);
		System.out.println(now);
		
		
	}

}
