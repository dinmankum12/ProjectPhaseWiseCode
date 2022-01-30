package main;

public class Classess {
	private String Section;
	private String Subject;
	private String Teacher_Name;
	private int Number_of_Students;
	
	
	public Classess(String section, String subject, String teacher_Name, int number_of_Students) {
		super();
		Section = section;
		Subject = subject;
		Teacher_Name = teacher_Name;
		Number_of_Students = number_of_Students;
	}
	@Override
	public String toString() {
		return "Classess [Section=" + Section + ", Subject=" + Subject + ", Teacher_Name=" + Teacher_Name
				+ ", Number_of_Students=" + Number_of_Students + "]";
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getTeacher_Name() {
		return Teacher_Name;
	}
	public void setTeacher_Name(String teacher_Name) {
		Teacher_Name = teacher_Name;
	}
	public int getNumber_of_Students() {
		return Number_of_Students;
	}
	public void setNumber_of_Students(int number_of_Students) {
		Number_of_Students = number_of_Students;
	}
		
	}
