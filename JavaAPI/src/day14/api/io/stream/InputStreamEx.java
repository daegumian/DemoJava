package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		/*
		 * 1. 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 2. 생성자 매개변수에 읽을 파일의 경로가 들어간다.
		 */
		
		try {
			
			//FileInputStream is = new FileInputStream(path); 가능!
			InputStream is = new FileInputStream(path); //이렇게 많이 씀. 부모클래스 사용.
			
			
			//1st
			//read()는 하나씩 데이터를 읽고, 더읽을 값이 없으면 -1을 반환.
//			boolean bool = true;
//			
//			while(true) {
//				int result = is.read();
//				if(result == -1) break;
//				System.out.print((char)result);//
//			}
			
			//2nd
			//read(배열)
			
			byte[] arr = new byte[2048];
			int result = is.read(arr); // 읽어들인 크기 반환
			System.out.println(result);
			
			int i = 0;
			while(true) {
				if(arr[i]==0) break;
				System.out.print((char)arr[i]); //￭ﾕﾘ￬ﾝﾴ 깨져서 나옴 한글이 저장되어 있기 때문.
				i++;
			}
			
			int result2 = is.read(arr); //더 읽을 데이터가 없을 땐 -1 반환.
			System.out.println(result2);// -1
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
