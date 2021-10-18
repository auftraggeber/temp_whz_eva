package whz.pti.eva.praktikum_02.grade.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Grade {

	@Id
	@GeneratedValue
	private int id;
	private String lecture, grade;
	
	public Grade(String lecture, String grade) {
		this.lecture = lecture;
		this.grade = grade;
	}
	
	public String getLecture() {
		return lecture;
	}
	
	public String getGrade() {
		return grade;
	}
	
}
