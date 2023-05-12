package day12.inter.basic2;

public class Dog extends Animal implements IPet{

	
	public void eat() {
		System.out.println("흰둥이는 사료를 먹어요");
	}

	@Override
	public void play() {
		System.out.println("원반 던지기를 하며 놀아요");
		
	}

}
