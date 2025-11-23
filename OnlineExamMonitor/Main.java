package OnlineExamMonitor;

public class Main {
    public static void main(String[] args) {

        StudentExamSession session = new StudentExamSession("S123");  //subject

        new ProctorDashboard(session);        //observer
        new AutoWarningSystem(session);       //observer
        new AuditLogger(session);            //observer

        session.setStatus("Joined Exam");
        session.setStatus("Suspicious Activity");
        session.setStatus("Exam Submitted");

    }
}
