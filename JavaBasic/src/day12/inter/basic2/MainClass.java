package day12.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger}; //배열에 객체 집어넣기.
		for(Animal ani : animals) { //향상된 for문, 데이터 타입 잘 생각해보기. Why Animal?
			ani.eat(); //Animal의 기능
		}
		
		//dog, cat은 Interface타입으로 형변환이 됩니다.
		//dog, cat, goldFish를 저장하고, Ipet의 기능을 사용.
		IPet[] pets = new IPet[3];
		IPet dog2 = new Dog();
		IPet cat2 = new Cat();
		
		
		//pets[1] = (IPet)tiger // tiger는 IPet의 기능이 없기 때문에 X
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish(); //자동 형변환
		
		for(IPet k : pets) {
			k.play();
		}
		
		System.out.println("-----------------");
		
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet((IPet)cat);
	}
}
