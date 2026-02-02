package Tostring;

public class Student {

	public static void main(String[] args) {
		Student s1 =new Student("Anis","Male","154625",99);
		System.out.println(s1.getName());
		System.out.println(s1);
	}
	
			String name;
			String gender;
			String mobile_no;
			int age;
	
	public Student(String name, String gender, String mobile_no, int age) {
		this.name = name ;
		this.gender = gender ;
		this.mobile_no = mobile_no;
		this.age = age ;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
		
	}
	public String getMobile_no() {
		return mobile_no;
		
	}
	public int getAge() {
		return age;
		
	}
	public String toString() {
		return name +" "+gender+" "+mobile_no+" "+age;
	}
}


