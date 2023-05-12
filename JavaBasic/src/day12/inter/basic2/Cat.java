package day12.inter.basic2;

public class Cat extends Animal implements IPet{

	
	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
	}

	@Override
	public void play() {
		System.out.println("고양이는 쥐를 잡고 놀아요");
	}

}
