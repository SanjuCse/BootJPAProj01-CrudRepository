package com.sanju;

public class Student {

	private Integer sid = 1;
	private String sname = "mahesh";
	private Double sfee = 1200.0;
	private String sschool = "GP Berhmapur";

	public void m1(int i1, int i2) {
		System.out.println("m1 method of Student class");
		System.out.println(i1 + i2);

	}

	public void m2() {
		System.out.println("m2 method of Student class");
	}

	public Student(Integer sid, String sname, Double sfee, String sschool) {
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.sschool = sschool;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", sschool=" + sschool + "]";
	}

}
