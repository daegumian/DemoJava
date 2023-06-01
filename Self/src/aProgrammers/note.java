package aProgrammers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class note {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 46; i++) {
			list.add(i);
		}
		Random ran = new Random();
		int randomNum = ran.nextInt(list.size());
		System.out.println(list.get(randomNum));
	}

}
