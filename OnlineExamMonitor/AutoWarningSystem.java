package OnlineExamMonitor;

public class AutoWarningSystem implements Observer {
    StudentExamSession studentExamSession;
    public AutoWarningSystem(StudentExamSession s){
        this.studentExamSession = s;
        studentExamSession.registerObserver(this);
    }
    public void update() {
        if(studentExamSession.getStatus().equalsIgnoreCase("Suspicious Activity")) {
            System.out.println("[Warning] ALERT for student " + studentExamSession.getStudentId());
        }
    }
}
