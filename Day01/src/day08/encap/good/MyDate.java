package day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉된 변수에 접근할 때, 미리 생성해놓은
	 * getter/setter를 사용합니당
	 * 
	 * setter메서드
	 * 1. 값을 저장하는 용도의 메서드
	 * 2. 접근제어자는 public으로 선언하고 이름은 (set+멤버변수명(=필드명))
	 * 
	 */

	public void setYear(int year) {//

		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값임 썬 오비 비취!!!");
			return;
		}else {			
			this.year = year;
		}
	}

	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름은 (get + 멤버변수명(필드명))
	 */

	public int getYear() {
		return year;

	}
	/*
	 * 1. month, day, ssn에 getter/setter생성
	 * 
	 * moneth = 1~12월까지만 저장
	 * day = 1~31일 저장
	 * ssn = 하이픈 제거하고 13자리까지만 저장 replace(), length()
	 * 
	 * 
	 */


	public void setMonth(int month) {

		if(month > 0 && month < 13) {
			this.month = month;
		}else {
			System.out.println("잘못 입력함요");
			return;
		}
	}
	
	public int getMonth() {
		return month;
	}

	
	
	public void setDay(int day) {

		if(day > 0 && day < 32) {
			this.day = day;
		}else {
			System.out.println("잘못 입력함요");
			return;
		}
	}
	public int getDay() {
		return day;
	}

	
	public void setSsn(String ssn) {

		if(ssn.length() == 14) {
			this.ssn = ssn.replace("-", "");
		}else {
			System.out.println("다시 입력하세요");
			return;
		}
	}
	
	public String getSsn() {
		return ssn;
	}

	










}
