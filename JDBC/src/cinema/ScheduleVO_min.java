package cinema;

public class ScheduleVO_min {
	private String schenum;
	private String schedate;
	private String schetime;
	private String leftseat;
	private TheaterVO theatervo;
	private FilmVO filmvo;
	
	public ScheduleVO_min() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleVO_min(String schenum, String schedate, String schetime, String leftseat, TheaterVO theatervo,
			FilmVO filmvo) {
		super();
		this.schenum = schenum;
		this.schedate = schedate;
		this.schetime = schetime;
		this.leftseat = leftseat;
		this.theatervo = theatervo;
		this.filmvo = filmvo;
	}

	public String getSchenum() {
		return schenum;
	}

	public void setSchenum(String schenum) {
		this.schenum = schenum;
	}

	public String getSchedate() {
		return schedate;
	}

	public void setSchedate(String schedate) {
		this.schedate = schedate;
	}

	public String getSchetime() {
		return schetime;
	}

	public void setSchetime(String schetime) {
		this.schetime = schetime;
	}

	public String getLeftseat() {
		return leftseat;
	}

	public void setLeftseat(String leftseat) {
		this.leftseat = leftseat;
	}

	public TheaterVO getTheatervo() {
		return theatervo;
	}

	public void setTheatervo(TheaterVO theatervo) {
		this.theatervo = theatervo;
	}

	public FilmVO getFilmvo() {
		return filmvo;
	}

	public void setFilmvo(FilmVO filmvo) {
		this.filmvo = filmvo;
	}

	
	
	
}
