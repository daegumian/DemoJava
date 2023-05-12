package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 생성자 매개값으로 파일을 쓸 경로가 들어갑니다. 
		 * io패키지 거의 모든 클래스들은 생성자에 throws가 걸려 있기 때문에
		 * 반드시 예외처리 문장안에서 사용합니다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";//<-쓸 프로그램 확장자도 적어야 한다.
		
		try {
			//부모 <추상화 개념> 때문에 이렇게 많이 쓰려고 한다. 부모 클래스로 담아 쓴다.
			//FileOutputStream out = new FileOutputStream(path);
			OutputStream out = new FileOutputStream(path);
			
			//1st
			//뭘로 쓸건데? 경로에 쓸 프로그램 확장자도 써줘야한다.
			//out.write(65); //한글자씩 씀
			//out.write(66);
			//out.write(67);
			
			
			//2nd // 배열에 들어있는 데이터를 한번에 쓸 수 있음!
			//byte[] arr = {65,66,67,68,69};
			//out.write(arr); // abcde
			
			//3nd
			String str = "하이"; //한글은 1byte기반으로 쓰기엔 적합하지 않다.
			byte[] arr = str.getBytes();//문자열을 바이트로 변환해주는 메서드.
			
			out.write(arr); //깨질 것이다.
			
			
			
			
			
			
			
			
			out.close();//자원해제
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
