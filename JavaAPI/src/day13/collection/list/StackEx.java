package day13.collection.list;

import java.util.List;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {

		/*
		 Stack
		 => last in fitst out (후입선출)
		 => push(), pop()
		 */
		
		Stack<String> stack = new Stack<>();
		
		//값의 추가
		stack.push("고길동");
		stack.push("도우너");
		stack.push("둘리");
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop(); //빠진값도 알려줌.
		System.out.println("pop된 값 : " + n);
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
