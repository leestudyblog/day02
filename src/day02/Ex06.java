package day02;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String name;
		int ko;
		int ing;
		int ma;
		
	    System.out.println("당신의 이름은 무엇입니까?");
	    name=sc.next();
	    
	    System.out.println("님의 국어점수 : ");
	    ko=sc.nextInt();
	    System.out.println("님의 영어점수 : ");
	    ing=sc.nextInt();
	    System.out.println("님의 수학점수 : ");
	    ma=sc.nextInt();
	    
	    System.out.println("==============");
	    System.out.println("이름 :" +name);
	    System.out.println("==============");
	    System.out.println("국어 :" +ko);
	    System.out.println("영어 :" +ing);
	    System.out.println("수학 :" +ma);
	    System.out.println("==============");
	    System.out.println("합계 :" +(ko+ing+ma));
	    System.out.println("==============");



	    
	}

}
