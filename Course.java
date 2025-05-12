import java.util.List;

public class Course {
	String code; //과목 코드
    String name; //과목명
    String type; //전공 / 교양
    int credits; //학점
    Professor professor; //담당 교수
    Schedule schedule; //시간표
    Classroom classroom; //강의실
    int maxStudents; //정원
    List<Student> students; //수강 학생
    List<Student> waitlist; //대기자 목록

    public boolean canEnroll() { return false; } //수강 가능 여부 확인
    public void addStudent(Student s) { } // 학생 수강 등록
    public void addToWaitlist(Student s) { } // 대기자 추가
    public void removeStudent(Student s) { } // 수강 취소
}
