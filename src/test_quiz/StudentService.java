package test_quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

	StudentDTO sDto = new StudentDTO();
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>(); //작성 폼

	int num = 0;
	String name = null, number = null,student = null,grade = null;
	int kor=0,eng=0,math=0,sum=0;
	double average;

	
	
	public void info() {
	    System.out.println("이름 입력");
	    name = scan.next();
	    System.out.println("학번 입력");

	    String numberck = scan.next();
	    for (Student s : list) { // ArrayList에서 등록된 학생의 학번과 비교
	        if (numberck.equals(s.getNumber())) {
	            System.out.println("이미 해당 학번이 존재합니다.");
	            return;
	        }
	    }
	    number = numberck;
	    
	    System.out.println("학년 입력");
	    grade = scan.next();
	    System.out.println("국어 점수 입력");
	    kor = scan.nextInt();
	    System.out.println("영어 점수 입력");
	    eng = scan.nextInt();
	    System.out.println("수학 점수 입력");
	    math = scan.nextInt();
	    sum = kor + eng + math;
	    average = sum / 3.0;
	    if(average>=90) {
	        grade = "A";
	    }else if(average>=80) {
	        grade = "B";
	    }else if(average>=70) {
	        grade = "C";
	    }else if(average>=60) {
	        grade = "D";
	    }else{
	        grade = "F";
	    }
	    System.out.println("등록 되었습니다 !!!");
	    Student st = new Student(name, number, grade, kor, eng, math, sum, average);
	    list.add(st);
	}

	public void serch() {
		System.out.print("찾을 학생 학번 입력 : ");
		String numberck = scan.next();
		for (Student s : list) { // ArrayList에서 학생 정보 검색
			if (numberck.equals(s.getNumber())) {
				grade = s.getGrade(); // 학년 정보 가져오기
				System.out.println("이름 : " + s.getName() +
						"\n학번 : " + s.getNumber() +
						"\n국어 : " + s.getKor() +
						"\n영어 : " + s.getEng() +
						"\n수학 : " + s.getMath() +
						"\n등급 : " + s.getGrade()); // 가져온 학년 정보 사용
				System.out.println();
				return; // 검색 완료 후 메서드 종료
			}
		}
		System.out.println("찾는 학생이 없습니다!!!\n");
	}

	public void AllSerch() {
		System.out.println("모든 학생 정보 출력:");
		for (Student s : list) { // ArrayList에서 모든 학생 정보 출력
			System.out.println("이름 : " + s.getName() +
					"\n학번 : " + s.getNumber() +
					"\n국어 : " + s.getKor() +
					"\n영어 : " + s.getEng() +
					"\n수학 : " + s.getMath() +
					"\n등급 : " + s.getGrade());
			System.out.println();
		}
	}
}

















