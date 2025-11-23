package OnlineExamMonitor;

public class ProctorDashboard implements Observer {
    StudentExamSession studentExamSession;
    
    public ProctorDashboard(StudentExamSession studentExamSession){
        this.studentExamSession = studentExamSession;
        studentExamSession.registerObserver(this);
    }
    public void update() {
        System.out.println("[Dashboard] Student " + studentExamSession.getStudentId() + " status: " + studentExamSession.getStatus());
    }
}
