package day02;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 상수 : 한 번 저장하면 변경할 수 없음. final /대문자 표기
		 문자열 : String	
		 초기화 : 변수의 초기값 지정 - 오류 방지(빈 변수 출력 시 오류)	 
		 */
		final int num =100;
		//num=200; //상수 오류
		System.out.println(num);
	
		String name ="홍길동";
		System.out.println(name);
		
		final String KOREA = "대한민국";
		System.out.println(KOREA);
		
		boolean bool =true;
		System.out.println(bool);
		bool=false;
		System.out.println(bool);
		
		//선변수 후저장
		String addr;
		addr="산골짜기";
		System.out.println(addr);
		
		int n1, n2, sum; n1=10; n2=20; 
		sum =n1+n2;
		System.out.println(sum);
		
		int num1=0, num2=0, sum2=0; //초기화
		sum2 =num2+num1;
		System.out.println(sum2);
		
		String a =null; //초기화
	}

}
