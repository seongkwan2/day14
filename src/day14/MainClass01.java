package day14;

import java.util.ArrayList;

/*
 wrapper class
 - 일반 8대 기본 자료형을 클래스 타입으로 변경한것
 - int, char, double...
 - Integer, Character, Double...
 */
/*
 
 --제네릭-- <>
 제네릭안에 들어가는것은 클래스타입 밖에 없다.
 <T>는 타입
 <E>엘리멘츠
  <K,V> 키,값
 */

class A01<E2222>{	//<T>를 입력하면 자료형을 부여하겠다는 의미
	public void sumFunc(E2222 n1, E2222 n2) {
		System.out.println(n1+", "+n2);
	}
	

}
public class MainClass01 {
	public static void main(String[] args) {
		A01<Integer> a = new A01<>();
		a.sumFunc(10,20);
		A01<String> a1 = new A01<>();
		a1.sumFunc("aaa","bbb");
	}
}






















