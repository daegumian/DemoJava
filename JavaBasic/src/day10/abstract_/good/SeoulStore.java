package day10.abstract_.good;

public /*방법1:abstract*/ class SeoulStore extends Store {

	@Override
	public void apple() {
		System.out.println("서울 지점 500원");
	}

	@Override
	public void grape() {
		System.out.println("서울 지점 600");
		
	}

	@Override
	public void orange() {
		System.out.println("서울 지점 600원");
		
	}

	@Override
	public void melon() {
		System.out.println("서울 지점 700원");
		
	}
}

