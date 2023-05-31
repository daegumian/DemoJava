package ticketing;
// 예매 내역 DAO 클래스
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class TicketingDAO {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String UID = "HR";
    private static final String UPW = "hr";
	
   

    public TicketingDAO() {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}
    	
       
    }

    // 예매 내역 조회 메서드
    public List<TicketingVO> getTicketingList() {
        List<TicketingVO> ticketingList = new ArrayList<>();

        String sql = "SELECT SCH.SCHEDATE, SCH.THEANUM, SCH.SCHETIME, TK.TICKPRICE, TK.TICKCOUNT, " +
                "FILM.FILMRUNTIME, FILM.FILMTITLE, TK.TICKDATE, TL.SEATNUM " +
                "FROM TICKETING TK " +
                "INNER JOIN SCHEDULE SCH ON TK.SCHENUM = SCH.SCHENUM " +
                "INNER JOIN TICKETLIST TL ON TK.TICKNO = TL.TICKNO " +
                "INNER JOIN FILM ON SCH.FILMNUM = FILM.FILMNUM";
        
        Connection conn =null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        	
        	conn = DriverManager.getConnection(URL,UID,UPW);
        	pstmt = conn.prepareStatement(sql);
        	rs = pstmt.executeQuery();
        	
            while (rs.next()) {
                TicketingVO ticketing = new TicketingVO();
                
                ticketing.setFilmtitle(rs.getString("FILMTITLE"));
                ticketing.setScheduleDate(rs.getString("SCHETIME"));
                ticketing.setTheaterNumber(rs.getString("THEANUM"));
                ticketing.setScheduleTime(rs.getString("SCHETIME"));
                ticketing.setTicketPrice(rs.getInt("TICKPRICE"));
                ticketing.setTicketCount(rs.getInt("TICKCOUNT"));
                ticketing.setTicketDate(rs.getString("TICKDATE"));
                ticketing.setRunningTime(rs.getString("FILMRUNTIME"));
                
                ticketing.setSeatNumber(rs.getString("SEATNUM"));

                ticketingList.add(ticketing);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ticketingList;
    }
}