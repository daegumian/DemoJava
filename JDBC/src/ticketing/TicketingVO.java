package ticketing;

import java.sql.Date;

//예매 내역 VO 클래스
public class TicketingVO {

	private String filmtitle;
	private String scheduleDate;
	private String theaterNumber;
	private String scheduleTime;
	private int ticketPrice;
	private int ticketCount;
	private String runningTime;
	private String ticketDate;
	private String seatNumber;
	
	public String getFilmtitle() {
		return filmtitle;
	}
	public void setFilmtitle(String filmtitle) {
		this.filmtitle = filmtitle;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getTheaterNumber() {
		return theaterNumber;
	}
	public void setTheaterNumber(String theaterNumber) {
		this.theaterNumber = theaterNumber;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	

	
}
