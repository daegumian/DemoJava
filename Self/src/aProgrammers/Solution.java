package aProgrammers;
/*
0 떼기
문제 설명
정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ n_str ≤ 10
n_str이 "0"으로만 이루어진 경우는 없습니다.
입출력 예
n_str	result
"0010"	"10"
"854020"	"854020"

 */
import java.util.*;
class Solution {
    public String solution(String n_str) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < n_str.length(); i++) {
			if(n_str.charAt(i) != 0) {
				break;
			}else {
			}
		}
        
        return answer;
	}




	public static void main(String[] args) {

		Solution s = new Solution();
		String[] strArr = {"a","bc","d","efg","hi"};
		String n_str = "0010";
		//String pat = "AABB";
		//String binomial = "43 + 12";
		//int[][] queries = {{0, 1}, {1,2}, {2,3}};
		//boolean[] attendance = {false, true, true, true, true, false, false};
		//int[] num_str = {3, 7, 2, 5, 4, 6, 1};
		//int[] arr2 = {55, 12, 65, 36};
		//int n = 27;
		double flo = 1.42;

		//boolean[] finished = {true, false, true, false};
		//String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		//		String[] intStrs = {"0123456789","9876543210","9999999999999"};

		System.out.println(s.solution(n_str));


	}


}