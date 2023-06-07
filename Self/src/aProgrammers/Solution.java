package aProgrammers;

import java.util.*;

/*
n개 간격의 원소들
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
5 ≤ num_list의 길이 ≤ 20
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ 4
입출력 예
num_list	n	result
[4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
[4, 2, 6, 1, 7, 6]	4	[4, 7]
 */

class Solution {
	public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) list.add(num_list[i]);
        return list.stream().mapToInt( i -> i).toArray();
	}


	public static void main(String[] args) {

		Solution s = new Solution();
		//		String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
		//		String my_string = "ProgrammerS123";
		//		int[][] parts = {{1, 3}, {0, 4}};
		//String[] str_list = {"u", "u", "l", "r"};
		int[] num_list = {4, 2, 6, 1, 7, 6};
		//		String[] intStrs = {"0123456789","9876543210","9999999999999"};

		System.out.println(s.solution(num_list, 2));


	}


}