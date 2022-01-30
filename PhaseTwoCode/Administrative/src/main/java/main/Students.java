package main;

public class Students {
	private int userId;
	private int userName;
	private int userLocation;
	private int Section;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserName() {
		return userName;
	}
	public void setUserName(int userName) {
		this.userName = userName;
	}
	public int getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(int userLocation) {
		this.userLocation = userLocation;
	}
	public int getSection() {
		return Section;
	}
	public void setSection(int section) {
		Section = section;
	}
	@Override
	public String toString() {
		return "Students [userId=" + userId + ", userName=" + userName + ", userLocation=" + userLocation + ", Section="
				+ Section + "]";
	}
	public Students(int userId, int userName, int userLocation, int section) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
		Section = section;
	}
	
}
