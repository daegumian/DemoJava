package quiz02;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv(); //기본생성자로.
		
		System.out.println(tv.company);
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println();
		
		tv.power();
		tv.changeChanner(-3);
		tv.changeChanner(3);
		tv.power();
	
	}
}
