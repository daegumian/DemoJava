package day15.api.io.readwrite;


import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) {

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";

		try (Reader fr = new FileReader(path)){//Closable 인터페이스 상속 O, 향상된 try-catch문 사용 가능

			int result;
			while((result = fr.read()) != -1) {//더이상 읽을 값이 없다면 -1을 반환
				System.out.print((char)result);//text에 저장된 값.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
