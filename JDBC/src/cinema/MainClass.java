package cinema;

import java.util.List;
import java.util.Scanner;



public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//필요한 객체 상단부에 선언

		while(true) {

			System.out.println("[1.조회, 2.추가, 3.수정]");
			System.out.println("메뉴 : ");

			int menu = scan.nextInt();

			if(menu == 1) { // select

				MovieScheduleDAO dao = new MovieScheduleDAO();
				List<ScheduleVO_park> schedules = dao.getMovieSchedules();

				System.out.println("영화 스케줄 리스트:");
				for (ScheduleVO_park schedule : schedules) {
					System.out.println("영화명: " + schedule.getMovieName());
					System.out.println("상영 날짜: " + schedule.getSchDate().substring(0,10));
					System.out.println("상영 시간: " + schedule.getSchTime());
					System.out.println("러닝 타임: " + schedule.getMovieRun());
					System.out.println("상영관 번호: " + schedule.getTheaterNum());
					System.out.println("---------------------------");
				}
				System.out.println(schedules.toString());

			}else if (menu == 2) { //





			}else if (menu == 3) { // 






			}else if (menu == 4) {

			}

		}

	}
}