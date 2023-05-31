package cinema;

import cinema.ScheduleVO_min;

public class TicketListVO {
	private TicketingVO tickvo;
	private ScheduleVO_min svo;
	private FilmVO fvo;
	
	public TicketListVO() {
		// TODO Auto-generated constructor stub
	}

	public TicketingVO getTickvo() {
		return tickvo;
	}

	public void setTickvo(TicketingVO tickvo) {
		this.tickvo = tickvo;
	}

	public ScheduleVO_min getSvo() {
		return svo;
	}

	public void setSvo(ScheduleVO_min svo) {
		this.svo = svo;
	}

	public FilmVO getFvo() {
		return fvo;
	}

	public void setFvo(FilmVO fvo) {
		this.fvo = fvo;
	}
	
	
	
	
}
