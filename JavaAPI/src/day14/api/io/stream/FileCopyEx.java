package day14.api.io.stream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {
	
	public static void main(String[] args) {
		
		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸 때 사용합니다.
		 */
		
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";// 파일 명까지
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\메서드1_copy.mp4"; //파일 명까지
		
		//향상된 try ~ catch문 : Closable 인터페이스를 상속받고 있어야만 사용가능
		//close작업을 대신함.
	
		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)){
			
			//읽음
			byte[] arr = new byte[2048];//1024byte -> 1kb, 2048 ->2kb
			
			int result;
			while((result = is.read(arr)) != -1) { //읽은 값이  -1이 아닐때까지
				
				//쓰기
				out.write(arr, 0, result);//arr데이터를 0에서 ~ 바이트배열의 result까지만 씀
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
//			
//			try {
//				is.close();
//				out.close();
//			} catch (Exception e) {
//				System.out.println("파일close에러");
//			}
//			
//		}
	}
}
