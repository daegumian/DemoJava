package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class 빠른입력 {

	public static void main(String[] args) {

		/*
		 * InputStreamReader은
		 * 1바이트 데이터를 => 2바이트 기반으로 변경
		 *  문제에서 빠른 입력을 원한다. 이걸 사용하면 된다.
		 */

		//		Reader rd = new InputStreamReader( System.in );
		//		BufferedReader bw = new BufferedReader(rd);
		//이렇게 주로 사용함.

		//이렇게 하면 close()안해도 된다.
		try(BufferedReader bw = new BufferedReader(new InputStreamReader( System.in ))) { 
			//BufferedReader bw = new BufferedReader(new InputStreamReader( System.in ));

			System.out.println(">");
			String name = bw.readLine();

			System.out.println(name);//입력받은 결과

			//			bw.close();
		} catch (Exception e) {

		}
	}
}
