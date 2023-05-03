package day14;

import java.util.ArrayList;
import java.util.Scanner;

class Member03{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Member03> list = new ArrayList<>();
		
		String name;
		int num;
		while(true) {
			System.out.println("1.등록");
			System.out.println("2.모든 내용 출력");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("이름 입력\n>>>");
				name = scan.next();
				Member03 m = new Member03();	//객체생성
				list.add(m);					//리스트에 값추가
				m.setName(name);				//그 값을 셋팅함
				System.out.println("저장완료");
				break;
			case 2:
				for(Member03 mm : list) {
					System.out.println(mm.getName());
					System.out.println("-----------");
				}
				break;
			default: System.out.println("잘못 입력 했습니다.");
			
			}
		}
	}
}
















