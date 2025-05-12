import java.util.List;

public class Professor extends User {
	String employeeId; //교번
    List<Course> courses; //담당 과목

    public void assignCourse(Course course) { } //과목 배정
    public void gradeStudent(Student student, Course course, String grade) { } //성적 부여
}
