package day14;

import java.util.ArrayList;
import java.util.Iterator;

class Member{
	private String name, addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		//타입명이 클래스이름
		Member m1 = new Member();
		m1.setAddr("산골짜기"); m1.setName("홍길동");
		list.add(m1);
		Member m01 = list.get(0);
		
		
		System.out.println(m01.getAddr());
		
		Member m2 = new Member();
		m2.setAddr("22산골짜기"); m2.setName("22홍길동");
		list.add(m2);
		System.out.println("==================");
		for(int i = 0; i<list.size();i++) {
			Member m = list.get(i);
			System.out.println(m.getName());
			System.out.println(m.getAddr());
			System.out.println("-----------------");
			
			//둘중하나 택1
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAddr());
			System.out.println("-----------------");
			
		}
		ArrayList<String> str = new ArrayList<>();
		str.add("aaa"); str.add("bbb");
		for(String s : str) {
			System.out.println(s);
		}
		
		for(Member mm  : list) {//list를 만들때 자료형이 Member클래스임
			//Member로 뽑아줌
			System.out.println(mm.getName());	//get을 안쓰고 mm만 작성하면
			System.out.println(mm.getAddr());	//mm의 주소가 출력된다.
		}
	}
}

















