package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 파일명을 입력을 받습니다.
		 * 
		 * 2. 입력받은 파일을 filecopy폴더로 복사해서 옮겨주면 된다.
		 * 
		 * 3. 자원해제
		 * 
		 */

		System.out.print("파일명 : ");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();

		String isPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+a+".png";
		
		String outPath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\"+a+".png";


		try(InputStream is = new FileInputStream(isPath);
				OutputStream out = new FileOutputStream(outPath)) {

			byte[] arr = new byte[2048];
			int result;
			
			while((result = is.read(arr)) != -1){
				
				out.write(arr, 0, result);

			}

			System.out.println("파일 복사 완료");
			scan.close();

		} catch (Exception e) {

		}



	}

}
