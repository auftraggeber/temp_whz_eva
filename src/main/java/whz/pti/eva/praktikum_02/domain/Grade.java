package whz.pti.eva.praktikum_02.domain;

public class Grade {
    private String lecture;

    public String getLecture() {
        return lecture;
    }

    private String grade;

    public Grade(String lecture, String grade) {
        this.lecture = lecture;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
