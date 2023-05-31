package ticketing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        // 데이터베이스 연결 정보 설정
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String uid = "HR";
        String upw = "hr";

        try {
            // 데이터베이스 연결
            Connection connection = DriverManager.getConnection(url, uid, upw);
            TicketingDAO ticketingDAO = new TicketingDAO();

            // 예매 내역 조회
            List<TicketingVO> ticketingList = ticketingDAO.getTicketingList();
            
            // 예매 내역 출력
         
            for (TicketingVO ticketing : ticketingList) {
            	System.out.println("영화명: " + ticketing.getFilmtitle());
                System.out.println("상영일자: " + ticketing.getScheduleDate());
                System.out.println("상영관 번호: " + ticketing.getTheaterNumber());
                System.out.println("상영시간: " + ticketing.getScheduleTime());
                System.out.println("결제 가격: " + ticketing.getTicketPrice());
                System.out.println("티켓 수량: " + ticketing.getTicketCount());
                System.out.println("러닝 타임: " + ticketing.getRunningTime());
                System.out.println("예매한 날짜: " + ticketing.getTicketDate());
                System.out.println("좌석 번호: " + ticketing.getSeatNumber());
                System.out.println("---------------------------------");
            }

            // 데이터베이스 연결 종료
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
