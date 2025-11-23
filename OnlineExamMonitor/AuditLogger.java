package OnlineExamMonitor;

public class AuditLogger implements Observer{
    StudentExamSession studentExamSession;
    public AuditLogger(StudentExamSession s){
        this.studentExamSession = s;
        studentExamSession.registerObserver(this);

    }
    public void update() {
        System.out.println("[Audit] Logged status: " + studentExamSession.getStatus() + " for " + studentExamSession.getStudentId());
    }
}
