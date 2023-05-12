package quiz15.Teacher;

import java.util.Arrays;
import java.util.Iterator;

public class Park1 implements IBag {

	private String[] arr = new String[100];
	private int index;

	@Override
	public void insert(String item) {
		arr[index] = item;
		index++;

	}
	@Override
	public void print() {
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int search(String item) {

		for(int i = 0; i < index; i++) {
			if(arr[i].equals(item)) {
				return i;
			}//else는 시작했다 끝났다가 된다. nono. 찾지 못하면 if문을 빠져나와야하니까! 마지막에 return을!

		}
		return -1; //없는 경우 -1
	}
	@Override
	public boolean delete(String item) {
		for (int i = 0; i < index; i++) {
			//찾은경우의 조건
			if(arr[i].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for (int j = 0; j < index - 1; j++) { // index길이 킬포
					arr[j] = arr[j+1];
				}
			}
			arr[index-1] = null;
			index--;

			return true;
		}


		return false;
	}




}
