package test_quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>(); //작성 폼
		Scanner scan = new Scanner(System.in);
		int num = 0;
		StudentService sService = new StudentService(); 

		while (true) {
			try {
				System.out.println("1.학생등록\n2.검색\n3.모든학생보기\n4.종료");
				System.out.print(">>>");
				num = scan.nextInt();
				switch(num) {
				case 1:
					sService.info();	//학생등록
					break;
				case 2:
					sService.serch();	//학생검색
					break;
				case 3:
					sService.AllSerch();	//모든학생보기
					break;
				case 4:
					// 종료 처리
					System.out.println("프로그램을 종료합니다.");
					return; // 메인 메소드를 빠져나가 프로그램 종료
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			} catch (Exception e) {
				System.err.println("숫자를 입력해주세요");
				scan.nextLine(); // 입력 버퍼 비우기
			}
		}
	}
}
