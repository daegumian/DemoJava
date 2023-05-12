package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileQuiz02 {
	public static void main(String[] args) {
		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */


		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504file";

		File file = new File(path);

		if(file.exists() == false) {
			file.mkdir();
		}else {
			System.out.println("이미 파일이 존재합니다.");
		}

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("입력 : ");
			String name = br.readLine();
			String path2 = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504file\\"+name+".txt";

			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true));
					BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
					Reader fr = new FileReader(path2)){

				while(true) {
					System.out.print("입력 : ");
					String str = br2.readLine();

					if(str.equals("그만") ) {	
						System.out.println("<저장된 문자>");
						bw.flush();//이걸 안쓰면 안줌.
						int result; 	//왜 여기에 넣으면 안될까? -> 답은 flush()!
						while((result = fr.read()) != -1) {
							System.out.print((char)result);
						}
						break;

					}else {
						bw.write(str+"\n");
					}
				}

			}

		} catch (Exception e) {
		}
	}
}
