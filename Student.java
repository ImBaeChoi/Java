import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	String studentId; //학번
    Department department; //소속 학과
    List<Enrollment> enrollments; // 수강 목록
    int maxCredits; //최대 신청 학점

    public void enroll(Course course) { }  //과목 수강 신청
    public void cancelEnrollment(Course course) { } //수강 취소
    public List<Schedule> getSchedule() { return null; } //시간표 조회
    public int getTotalCredits() { return 0; } //신청 학점 합계
}
