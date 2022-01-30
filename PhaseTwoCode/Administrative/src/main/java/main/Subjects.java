package main;

public class Subjects {
	private String Subject_Name;
	private String Shortcut;
	public String getSubject_Name() {
		return Subject_Name;
	}
	public void setSubject_Name(String subject_Name) {
		Subject_Name = subject_Name;
	}
	public String getShortcut() {
		return Shortcut;
	}
	public void setShortcut(String shortcut) {
		Shortcut = shortcut;
	}
	@Override
	public String toString() {
		return "Subjects [Subject_Name=" + Subject_Name + ", Shortcut=" + Shortcut + "]";
	}
	public Subjects(String subject_Name, String shortcut) {
		super();
		Subject_Name = subject_Name;
		Shortcut = shortcut;
	}
	
}
