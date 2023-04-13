package day02;


public class Ex01 {
	public static void main(String[] args) {
		/*
		 - 변수 : 데이터를 저장하는 공간
		 
		 - 자료형 : 데이터가 어떤 값인지에 따라 사용하는 값
		   int :정수 표현 (4byte)
	       float & double : 실수 표현 (4 & 8byte)		 
		   char : 문자 표현 (2byte)
		   boolean : true & false 표현(1byte)
		   
		 - 변수 생성 
		   자료형 변수명; & 자료형 변수명 = 값;  
		   합성어 변수 :changeNum(camel) & change_num() 
		   예약어 X
		 */
		
		int age =50;
		float height = 150; //150.0으로 하면 오류(실수 값은 double에서 사용) & 150.0f으로 사용 가능
		double weigth = 20.0;
		
		System.out.println("나의 나이는 "+age+"살 입니다.");
		System.out.println("나의 만 나이는 "+(age-1)+"살 입니다.");
		System.out.println("나의 키는 "+height+"cm입니다.");
		System.out.println("나의 몸무게는 "+weigth+"kg입니다.");

		
	}
}
