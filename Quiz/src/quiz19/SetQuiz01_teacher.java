package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01_teacher {
	public static void main(String[] args) {
		
		/*배열로도 할 수 있다.
		 * 중복되지 않는 6자리 수 (로또번호)
		 	
		 	1.random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 	2.set에 6개의 랜덤한 로또 번호를 저장해주세요.
		 *
		 */
		
		//몇 바퀴 돌릴지 모르겠다면? while(true)문!! -> 탈출의 조건을 만들면 되니깐
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		int n = ran.nextInt(45)+1; // 1~45
		
		while(set.size() < 6) {
			set.add(ran.nextInt(45)+1);
		}
		
		System.out.println(set.toString());
	}
}
