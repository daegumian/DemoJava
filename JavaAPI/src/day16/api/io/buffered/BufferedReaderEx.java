package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향상보조스트림임.
		 * Reader클래스와 같이 사용됨.
		 * 
		 * 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		
		//BufferedReader br = new BufferedReader(new FileReader(path));
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String result;
			while( ( result = br.readLine())!=null) {
				
				System.out.println(result);
			}

		} catch (Exception e) {
		}
		
	}

}
