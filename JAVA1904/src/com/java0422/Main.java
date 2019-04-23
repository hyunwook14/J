package com.java0422;

import com.java0423.Var;

public class Main {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수시작");
		String 문자열 ="Hello World"; //선언과 대입 한번에 이루어진다.
		String 문자열선언; //변수 만들기
		문자열선언 ="";    //변수에 값을 대입한다.
		System.out.println(문자열); //변수사용
		문자열 = "문자열 변경";        //값 변경
		System.out.println(문자열); //변수 사용
		문자열 = "1234";   //연산
		System.out.println(문자열); //변수사용
		
		int 정수 = 1;
		System.out.println(정수);
		
		String 결과값 = 문자열+ 정수; //
		System.out.println(결과값);
		
		결과값 = 정수+정수+정수+문자열;
		System.out.println(결과값);
		
		float f = 0.1f;
		double d = 10.5;
		
		System.out.println("f="+f);
		System.out.println("d="+d);
		
		byte b1 = 1;
		int i1 =100;
		i1 = b1;
		short s1 = 2;
		b1 = (byte)s1;
		System.out.println(i1);
		System.out.println("안 \b\t녕하세요? \0");
		
		Var v = new Var();
		int s = v.state1;
		System.out.println(s);
	}

}
