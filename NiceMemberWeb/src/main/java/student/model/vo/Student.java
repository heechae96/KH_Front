package student.model.vo;

import java.sql.Date;

public class Student {
	private String studentId;
	private String studentPw;
	private String studentName;
	private String studentEmail;
	private String studentPhone;
	private String studentAddress;
	private String gender;
	private Date studentDate;

	public Student() {
		super();
	}

	public Student(String studentId, String studentPw) {
		super();
		this.studentId = studentId;
		this.studentPw = studentPw;
	}

	public Student(String studentId, String studentPw, String studentName, String studentEmail, String studentPhone,
			String studentAddress, String gender, Date studentDate) {
		super();
		this.studentId = studentId;
		this.studentPw = studentPw;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
		this.gender = gender;
		this.studentDate = studentDate;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentPw() {
		return studentPw;
	}

	public void setStudentPw(String studentPw) {
		this.studentPw = studentPw;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentGender() {
		return gender;
	}

	public void setStudentGender(String gender) {
		this.gender = gender;
	}

	public Date getStudentDate() {
		return studentDate;
	}

	public void setStudentDate(Date studentDate) {
		this.studentDate = studentDate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentPw=" + studentPw + ", studentName=" + studentName
				+ ", studentEmail=" + studentEmail + ", studentPhone=" + studentPhone + ", studentAddress="
				+ studentAddress + ", gender=" + gender + ", studentDate=" + studentDate + "]";
	}

}
