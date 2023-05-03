package test_quiz;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private String number;
	private String student;
	private String grade;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double average;
	
	public Student() {}	//기본생성자
	
	public Student(String name, String number, String grade, int kor, int eng, int math, int sum, double average) {
	    this.name = name;		//값을 받아오는 생성자
	    this.number = number;
	    this.grade = grade;
	    this.kor = kor;
	    this.eng = eng;
	    this.math = math;
	    this.sum = sum;
	    this.average = average;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
}

public class testStudent {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>(); //작성 폼
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String name = null, number = null,student = null,grade = null;
		int kor=0,eng=0,math=0,sum=0;
		double average;

		while (true) {
			try {
				System.out.println("1.학생등록\n2.검색\n3.모든학생보기\n4.종료");
				num = scan.nextInt();
				switch(num) {
				case 1:
					System.out.println("이름 입력");
				    name = scan.next();
				    System.out.println("학번 입력");
				    number = scan.next();
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
				    
				    Student st = new Student(name, number, 
				    		grade, kor, eng, math, sum, average);

				    list.add(st);
					break;
				case 2:
					System.out.print("찾을 학생 학번 입력 : ");
					String numberck = scan.next();
					if(numberck.equals(number)) {
						System.out.println("이름 : "+name+
								"\n학번 : "+number+
								"\n국어 : "+kor+
								"\n영어 : "+eng+
								"\n수학 : "+math+
								"\n등급 : "+grade);
						System.out.println();
						break;
					}else {
						System.out.println("찾는 학생이 없습니다!!!\n");
					}
					
					break;
				case 3:
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




















