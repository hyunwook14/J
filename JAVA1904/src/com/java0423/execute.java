package com.java0423;

public class execute {

	public  void main(String[] args) {
		// TODO Auto-generated method stub

		
		Add button1 = new Add();
		int x = 10;
		int y = 5;
		int result = button1.add(x, y);
		System.out.println("결과값은 "+ button1.add(x, y));
		
		System.out.println(add(5,3)); //8
		System.out.println(뺄셈(5,3)); //2
		System.out.println(나눗셈(10,3));//5
		System.out.println(곱셈(100,2));//200
		add(10,10);
		
	}
     //메인메소드가 정적이라  메소드도 정적이어야지 쓸 수 있음 
	//---> 메인메소드있는 자바파일에 다른 메소드를 정의해서 사용하려면 메인메소드가 static이라 다른 메소드도 static이라 사용가능
    // static을 사용 안하려면 새로운 class 자바파일을 만들어서 사용하면 됨
	static int add(int a, int b) {
		return a+b;
	}
	 static int 뺄셈(int a, int b) {
		return a-b;
	}
	 static float 나눗셈(float a, float b) {
		 return a/b;
	 }
	 
	 static int 곱셈(int a, int b) {
		 return a*b;
	 }
}
