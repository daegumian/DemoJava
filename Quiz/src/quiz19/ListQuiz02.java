package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>(); //배열 대체
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램 종료");
			System.out.print("메뉴(번호) : ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가.
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("나이 : ");
				int age = scan.nextInt();
				User u1 = new User(name, age);
				list.add(u1);
				break;
			case 2:
				//리스트에 담긴 모든 회원 이름, 나이를 출력.
				//				for(int i = 0; i < list.size(); i++) {
				//					User u2 = list.get(i);
				//					System.out.print(u2.getName() + " ");
				//					System.out.println(u2.getAge());
				//				}
				for( User k : list) { // 향상된 for문 사용해보기.
					System.out.print(k.getName()+ " ");
					System.out.println(k.getAge());
				}

				break;
			case 3:
				//찾을 이름을 새롭게 입력 받아서, 이름이 있다면, 해당 회원 이름, 나이 출력.
				//조건 - 찾는 이름이 없다면 "~~~는 목록에 없습니다." 출력.
				System.out.println("이름 : ");
				String sh = scan.next();

				for (int i = 0; i < list.size(); i++) {
					User u2 = list.get(i);
					if(u2.getName().equals(sh)) {
						System.out.print(u2.getName() + " ");
						System.out.println(u2.getAge());
						break;
					}
				}


				break;
			case 4:
				//삭제할 이름을 입력받아서, 이름과 동일한 User객체를 첫번째 1개만 삭제.
				System.out.println("삭제 : ");
				String del = scan.next();
				for (int i = 0; i < list.size(); i++) {
					User u2 = list.get(i);
					if(u2.getName().equals(del)) {
						System.out.println(u2.getName() + "님이 삭제되었습니다.");
						list.remove(i);
					}
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				break;
			}

		}
	}

}
