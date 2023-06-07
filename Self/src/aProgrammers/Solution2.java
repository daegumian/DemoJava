package aProgrammers;

import java.util.*;

/*
순서 바꾸기
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, 
num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 
return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
입출력 예
num_list	n	result
[2, 1, 6]	1	[1, 6, 2]
[5, 2, 1, 7, 5]	3	[7, 5, 5, 2, 1]
 */

class Solution2 {
	public int[] solution(int[] num_list, int n) {

        int[] copy = Arrays.copyOf(num_list, num_list.length * 2);
        System.out.println(Arrays.toString(copy));
        
        System.arraycopy(num_list, 0, copy, num_list.length, num_list.length);
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(Arrays.copyOfRange(copy, n, n + num_list.length)));
        return Arrays.copyOfRange(copy, n, n + num_list.length);

	}


	public static void main(String[] args) {

		Solution2 s = new Solution2();
		//		String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};
		//		String my_string = "ProgrammerS123";
		//		int[][] parts = {{1, 3}, {0, 4}};
		int[] num_list = {2,1,6};
		int[] arr2 = {4, 1, 2};
		//		String[] intStrs = {"0123456789","9876543210","9999999999999"};

		System.out.println(s.solution(num_list, 1));


	}


}