package API_First_Maven_Project.API_First_Maven_Project;

import java.io.Serializable;

public class Class_POJO_Post1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String FirstName;
	String LastName;
	String Designation;
	String Id;
	String MentorName;
	String CourseName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMentorName() {
		return MentorName;
	}
	public void setMentorName(String mentorName) {
		MentorName = mentorName;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	

}
