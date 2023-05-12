package quiz15;

import java.util.Iterator;

public class Park implements IBag {

	String[] arr = new String[100];
	int count;

	@Override
	public void insert(String item) {
//		for (int i = 0; i < count+1; i++) {
//			arr[count-1] = item;
//		}
		arr[count] = item;
		count++;
	}

	@Override
	public void print() {
		System.out.print("출력 : ");
		for (int j = 0; j < count; j++) {
			System.out.print(arr[j] + " ");
			
		}
		
	}
	@Override
	public int search(String item) {
		System.out.println();
		for (int i = 0; i < count; i++) {
			if(arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) {
		
		for (int i = 0; i < count; i++) {
			//찾은 경우의 조건
			if(arr[i].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for(int j = 0; j < count - 1; j++) {
					
					arr[j] = arr[j+1];
				}
				
			}
			arr[count-1] = null;
			count--;
			return true;
		}

		return false;
	}



}
