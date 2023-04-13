package day02;

public class Ex02 {

	public static void main(String[] args) {
		int num =123;
		char ch ='a'; // " "는 문자열 / 문자 하나 값은 ''
		
		System.out.println("변경전");
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		
		num= 500;
		ch ='b';
		System.out.println("변경후");
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);

		num =num+200;
		System.out.println("num : " + num);
	}

}






