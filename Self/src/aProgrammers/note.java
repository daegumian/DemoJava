package aProgrammers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class note {

	public static void main(String[] args) {
		int a = 3;
		int result = 0;
		
		for (int i = 1	; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 2; j < 10; j++) {
				result = j * i;
				System.out.println(result);
			}
			System.out.println();
		}
		
	}

}
