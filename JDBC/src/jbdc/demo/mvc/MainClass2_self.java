package jbdc.demo.mvc;

import java.util.List;
import java.util.Scanner;

public class MainClass2_self {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//필요한 객체 상단부에 선언
		DeptsDAO deptDAO = new DeptsDAO();
		
		while(true) {

			System.out.println("[1.조회, 2.추가, 3.수정]");
			System.out.println("메뉴 : ");

			int menu = scan.nextInt();
			
			if(menu == 1) { // select
			List<DeptsVO> list = deptDAO.getDepts("박동훈짱짱짱부서");

			System.out.println(list.toString());
			
			}else if (menu == 2) { // insert
				System.out.println("부서명 : ");
				String name = scan.nextLine();
				System.out.println("매니저아이디 : ");
				int manager_id = scan.nextInt();
				System.out.println("로케이션아이디 : ");
				int location_id = scan.nextInt();
				
				DeptsVO vo = new DeptsVO(0, name, manager_id, location_id);
				
				//매개변수전달
				deptDAO.insertDepts(vo);
				

			}else if (menu == 3) { // 
				
				
				
				
				

			}else if (menu == 4) {

			}

		}
	}

}
