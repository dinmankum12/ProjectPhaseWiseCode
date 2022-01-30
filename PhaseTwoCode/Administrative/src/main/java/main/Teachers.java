package main;

public class Teachers {
	private int Teacher_id;
	private int Teacher_Name;
	private int Age;
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
	}
	public int getTeacher_Name() {
		return Teacher_Name;
	}
	public void setTeacher_Name(int teacher_Name) {
		Teacher_Name = teacher_Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Teachers [Teacher_id=" + Teacher_id + ", Teacher_Name=" + Teacher_Name + ", Age=" + Age + "]";
	}
	public Teachers(int teacher_id, int teacher_Name, int age) {
		super();
		Teacher_id = teacher_id;
		Teacher_Name = teacher_Name;
		Age = age;
	}
	
}
