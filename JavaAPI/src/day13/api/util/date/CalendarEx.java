package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		//Calendar cal = new Calendar();
		
		//static메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		
//		System.out.println(Calendar.YEAR);//1
//		System.out.println(Calendar.MONTH);//2
//		System.out.println(Calendar.DATE);//5
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year); //년
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month+1); //월은 +1을 해줘야한다.1작게나옴. 개발자가 실수함.
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); //일
	
		int hour = cal.get(Calendar.HOUR); //시
		int min = cal.get(Calendar.MINUTE); //분
		int second = cal.get(Calendar.SECOND); //초
	
		System.out.println(Calendar.DATE); //시
		System.out.println(Calendar.MINUTE); //분
		System.out.println(Calendar.SECOND); //초
	
	}
	

	
	
	

}
