package test_quiz;

public class StudentDTO {
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

}
