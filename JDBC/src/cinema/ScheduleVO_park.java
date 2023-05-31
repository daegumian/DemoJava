package cinema;

import java.sql.Date;

public class ScheduleVO_park {
    private String filmtitle;
    private String filmruntime;
    private String theaterNum;
    private String schTime;
    private String schDate;

  
    
    
   

    public ScheduleVO_park(String filmtitle, String filmruntime, String theaterNum, String schTime, String schDate) {
        this.filmtitle = filmtitle;
        this.filmruntime = filmruntime;
        this.theaterNum = theaterNum;
        this.schTime = schTime;
        this.schDate = schDate;
       
        
    }



	public String getMovieName() {
		return filmtitle;
	}

	public void setMovieName(String movieName) {
		this.filmtitle = movieName;
	}

	public String getMovieRun() {
		return filmruntime;
	}

	public void setMovieRun(String movieRun) {
		this.filmruntime = movieRun;
	}

	public String getTheaterNum() {
		return theaterNum;
	}


	public void setTheaterNum(String theaterNum) {
		this.theaterNum = theaterNum;
	}

	public String getSchTime() {
		return schTime;
	}


	public void setSchTime(String schTime) {
		this.schTime = schTime;
	}

	public String getSchDate() {
		return schDate;
	}

	public void setSchDate(String schDate) {
		this.schDate = schDate;
	}

   
}
