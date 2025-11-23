package OnlineExamMonitor;

import java.util.ArrayList;
import java.util.List;

public class StudentExamSession implements Subject {
    private List<Observer> observers;
    private String studentId;
    private String currentStatus;

    public StudentExamSession(String id) {
        observers = new ArrayList<Observer>();
        studentId = id;

    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void setStatus(String status) {
        currentStatus = status;
        notifyObserver();
    }
    public String getStudentId() {
        return studentId;
    }

    public String getStatus() {
        return currentStatus;
    }

}
