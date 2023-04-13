package day02;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 자료형 변환
		 : 특정 자료형을 다른 자료형으로 변환하는 것
		 */
		
		char ch ='a';
		int num =65;
		System.out.println(num);
		System.out.println(ch);
		//char ch02 =num; -> 에러 발생 저장 공간 차이 때문 
		char ch02 =(char)num; //65값을 문자로 변환함. 강제 형 변환
		int num02 =ch; // int char은 어느 정도 호환. 자동 형 변환
		
		System.out.println(num02);
		System.out.println(ch02);
		
	}

}
