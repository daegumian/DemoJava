package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();
		Set<Entry<String, Integer>> entryset = map.entrySet();
		
		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				System.out.print("메뉴 입력 : ");
				String nf = scan.next();
				if(map.containsKey(nf)) {
					System.out.println("이미 등록된 메뉴 입니다.");
				}else {
					System.out.print("가격 입력 : ");
					int nfp = scan.nextInt();
					System.out.println("-----변경 정보 내용------");
					System.out.println("<" + nf+ ">"+" 메뉴가 등록 되었습니다.");
					map.put(nf, nfp);
				}

			} else if(menu == 2) { //메뉴판 전체 보기
				System.out.println("  <메뉴>        <가격>");
				for(Entry<String, Integer> entry : entryset) {
					System.out.print("메뉴 : " + entry.getKey() + " / ");
					System.out.println("가격 : " + entry.getValue()+"원");
				}
				
			} else if(menu == 3) {// 메뉴판 수정
				System.out.print("메뉴 입력 : ");
				String cf = scan.next();
				if(map.containsKey(cf)) {
					System.out.print("가격 입력 : ");
					int cfp = scan.nextInt();
					System.out.println("<" + cf+ ">"+" 메뉴 가격이 수정 되었습니다.");
					map.put(cf, cfp);
				}else {
					System.out.println("수정 할 메뉴가 없습니다.");
				}
				
			} else if(menu == 4) { //삭제
				System.out.print("메뉴 입력 : ");
				String df = scan.next();
				if(map.containsKey(df)) {
					System.out.println("<" + df+ ">"+" 메뉴가 삭제 되었습니다.");
					map.remove(df);
				}else {
					System.out.println("삭제 할 메뉴가 없습니다.");
				}

			} else if(menu == 5) {
				System.out.println("프로그램 종료합니다");
				System.exit(menu);
			
			}

		}

	}
}
