package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyDate me = new MyDate();
//		me.day = 2022;
		System.out.println("내 생년 월일은...");
		me.setYear(1991);
		int year = me.getYear();
		System.out.println(year+"년");

		me.setMonth(7);
		me.setDay(31);
		me.setSsn("910722-1768014");
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(ssn+"");
		
		
	}

}
