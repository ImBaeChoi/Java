
public class Schedule {
	String day; //요일
    int startTime; //시작 시간
    int endTime; //종료 시간

    public boolean conflictsWith(Schedule other) { return false; } //시간 충돌 여부
}
