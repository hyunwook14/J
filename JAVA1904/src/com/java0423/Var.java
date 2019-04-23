package com.java0423;

public class Var {
	
	public Var() { var(); } //기본 생성자  리턴값이 없다 

	
	public int state1 =1;
	protected int state2 =2;
	int state3 =3;
	private int state4 =4;
	
//리턴유형  함수명(매계변수)      로직구현
//void   var ()            {}
	 void var()             {
		/****************************************************************
		 * 0.객체 (object > class)
		 * 1.변수
		 * 2.메소드(method)
		 * 3.출력
		 * 4.연산(사칙연산) : + - / * % ++ -- 
		 * 5.접근제한자(public) 4개  private default protected public 
		 * 6.정적(static) -> 메모리에 먼저 올려서 실행시킨다.  고정값을 이용할때 
		 * 7.리턴타입(void) 객체도 사용가능    값을 반환해준다.
		 * 8.자료형(유형) 객체도 자료형에 포함(사용자 정의 유형에 속함)
		 * 9.매계변수( 메소드 값 호출시 같이 보낼 값)
		 ****************************************************************/
		
		/****************************************************************
		 * 변수 사용법
		 * 1. 변수 선언
		 * 2. 변수에 데이터 대입(값 담기)
		 * 3. 변수 사용
		 ****************************************************************/
		
		int a;   //1.변수선언
		a = 1;   //2.대입
	//	System.out.println(a); //3.사용
		
		int b =2; //1, 2 즉  변수선언과 대입 동시 사용
//		System.out.println(b);
		
		int c, d, e; //자료형이 동일하면 변수를 한번에 선언가능 1
		c = a;       //2 변수에 변수값을 넣을때 주소를 넣는다. a가 가리키는 주소값을 줘서 c가 a의 주소값을 공유하기때문에 값이 1이다
		d = b;       //2
		e = c+d;     //2
		
//		System.out.println(e); //3
		
		int f;
		f = a;
//		System.out.println(f);
		
		a= 10;
		a = a%3;
		System.out.println(a); //10/3= 1
		
	}
	 
	 void var2(int a, int b) {
		 System.out.println( a+b);
	 }
}
