package aProgrammers;

import java.lang.reflect.Array;

/*
특정한 문자를 대문자로 바꾸기
문제 설명
영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
입출력 예
my_string	alp	result
"programmers"	"p"	"Programmers"
"lowercase"	"x"	"lowercase"
 */
import java.util.*;
class Solution {
	public String solution(String my_string, String alp) {
        String answer = "";
        return answer;
	}


	public static void main(String[] args) {

		Solution s = new Solution();
		//		String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
				String my_string = "programmers";
				String alp = "p";
		int[][] queries = {{0, 1}, {1,2}, {2,3}};
		String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
		int[] num_list = {2, 3, 4, 5};
		
		boolean[] finished = {true, false, true, false};
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		//		String[] intStrs = {"0123456789","9876543210","9999999999999"};

		System.out.println(s.solution(my_string, alp ));


	}


}