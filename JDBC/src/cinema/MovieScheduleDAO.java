package cinema;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieScheduleDAO {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "HR";
    private static final String PASSWORD = "hr";

    public List<ScheduleVO_park> getMovieSchedules() {
        List<ScheduleVO_park> schedules = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 데이터베이스 연결
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            // 스케줄 및 영화 테이블을 조인하여 결과 가져오기
            String query = "SELECT F.FILMTITLE, S.SCHETIME, S.THEANUM, F.FILMRUNTIME, S.SCHEDATE " +
                           "FROM SCHEDULE S " +
                           "JOIN FILM F ON S.FILMNUM = F.FILMNUM";
            resultSet = statement.executeQuery(query);

            // 결과를 ScheduleVO 객체로 변환하여 리스트에 추가
            while (resultSet.next()) {
                String filmtitle = resultSet.getString("FILMTITLE");
                String filmruntime = resultSet.getString("FILMRUNTIME");
                String theaterNum = resultSet.getString("THEANUM");
                String schTime = resultSet.getString("SCHETIME");
                String schDate = resultSet.getString("SCHEDATE");

                ScheduleVO_park schedule = new ScheduleVO_park(filmtitle, filmruntime, theaterNum, schTime, schDate);
                schedules.add(schedule);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 리소스 해제
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return schedules;
    }
}


