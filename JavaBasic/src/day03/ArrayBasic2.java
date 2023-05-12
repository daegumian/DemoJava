package day03;

public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//배열의 순회
//		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10
////					(0,1,2,3,4,5,6,7,8,9,)인덴스 번째는.		
//		int a = 0; //배열의 시작은 0
//		while(a < arr.length) { //배열의 끝은 (길이 -1) or 배열의 길이 명령문(범위 설정 생각)
//								//거의 배열의 길이를 활용한 조건엔 *초과,미만*을 쓴다. //자동완성 사용 가능.
//			System.out.println("배열의" + a + "인덱스:" + arr[a]);
//			a++;
//		}
		
		//배열 값들의 합
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;
		int sum = 0; //값 누적하는 변수.
		while(i<arr.length) {
			
			sum += arr[i]; //arr[i] = i값의 요소들 //어차피 0을 더하니까 i 초기화를 0으로 해도 누적값에 변화 X
			i++;
		
		}System.out.println("배열값들의 합 : " + sum);
		
		
		
		
	}
}
