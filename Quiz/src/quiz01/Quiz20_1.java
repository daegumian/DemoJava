package quiz01;
/*
 * 
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Quiz20_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int[] arr = new int[a];
		
		int max = arr[0];
		
		int i = 0;
		while(i < arr.length) {
			
			arr[i] = scan.nextInt();
			
			i++;
		}
		
		//최소, 최대 결정
		
		
		int min = arr[0]; // min값을 왜 밑에다가 초기화를 해야 하지???
		
		i=0;
		while(i<arr.length) {
			
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			i++;
		}
		System.out.println(max + " " + min);
		
		
	}
}
