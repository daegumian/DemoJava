package day15.api.io.buffer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderUTF8 {

	public static void main(String[] args) {
		
		/*
		 * 인코딩 = 파일or텍스트문서가 저장될 때 => 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 * 디코딩 = 컴퓨터가 아는 이진수 형태 => 인간이 알고 있는 문자형식으로 변경
		 * 
		 * 인코딩 대표형식
		 * 문자인코딩 보통 UTF-8 코드 vs EUC-KR
		 * 파일인코딩 Base64(유니코드)
		 * 
		 * InputStreamReader = 1byte기반파일을 => 2byte기반으로 변경
		 * 파일을 읽을 때 인코딩 형식을 같이 지정할 수 있다
		 *
		 * 2가지 방법
		 * 1. 원본파일의 인코딩을 UTF-8로 변경
		 * 2.파일의 인코딩형식이 다르면 (한글)이 깨지게 되는데 인코딩을 동일한 형태로 가지고 오면 된다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		//1byte타입으로 바꿔서 해결해야한다
		//InputStream fis = new FileInputStream(path); // 1byte 기반
		//Reader rd = new InputStreamReader( fis,"UTF-8" ); //1바이트기반 => 2바이트 형식 변경, 중간자 역할
		//BufferedReader br = new BufferedReader( rd ); // 2byte 기반 빠른 읽기
		
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {

		}
		
	}
}
