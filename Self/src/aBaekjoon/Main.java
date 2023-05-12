package aBaekjoon;

/*
문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 
처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력 1 
baekjoon
예제 출력 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1(A - Z까지) 순번 + " "
a b c d e f g h i j k l m n o p q r s t u  v w x y z 
//97~122아스키코드 소문자a-z

알파벳에 "baekjoon"을 넣어서 몇번째인지 출력.
"baekjoon"에 알파벳을 넣어야 하나?

//문자열의 위치확인 indexOf, lastIndexOf => 없다면 -1을 반환(굉장히 중요하나 개념)
		int idx = str.indexOf("녕"); // 0  
		System.out.println(idx); // 0
baekjoon
 */
import java.util.Scanner;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		//---------------------------------- String 타입 a.

		Scanner scan = new Scanner(System.in);

		char[] arr = new char[26];

		for(int i=0;i<arr.length;i++){    
			arr[i] = (char)(97+i);
		}
		System.out.println(Arrays.toString(arr));

		String arr2 = new String(arr); //스트링 타입 알파벳
		System.out.println(arr2);
		
		String idx = "";
		String arr3 = scan.next();
		for(int i = 0; i<arr3.length();i++) {
			idx += arr3.indexOf(arr3.charAt(i));
		}
		System.out.println(idx);
		
		String idx2 = "";
		for(int i = 0; i<arr3.length();i++) {
			idx2 += arr2.indexOf(arr3.charAt(i))+" ";
//			idx2 = arr3.charAt(i)+" ";
		}
		System.out.println(idx2); // -> 그 알파벳이 있는 인덱스 번호
		



	}



}
