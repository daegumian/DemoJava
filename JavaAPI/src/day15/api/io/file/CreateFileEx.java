package day15.api.io.file;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {

		/*
		 * File클래스
		 * 외부경로에 폴더 or 단순한 파일 생성이나 삭제를 할 수 있다.
		 * 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230503";

		try {//closeable 인터페이스 상속 X 향상된 try ~ catch 사용 x
			File file = new File(path);

			//파일 생성
			if( file.exists() == false) {

				file.mkdir(); //make directory의 약자
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("이미 폴더가 존재합니다");
			}

			//파일 생성
			if(file.exists() == true) {

				file.delete();
				System.out.println("폴더 삭제 완료");
			}else {
				System.out.println("폴더가 존재 하지 않습니다");
			}

		} catch (Exception e) {
		}
	}
}