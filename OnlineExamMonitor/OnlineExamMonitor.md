# Problem: Implement an Online Exam Monitoring System using Observer Pattern

## Overview

You are building an Online Exam Platform that needs to monitor student activity in real-time. Multiple monitoring modules must react when a student's status changes during an exam. Design this system using the **Observer Design Pattern**.

---

## Scenario

Each student taking the exam can change states such as:

* Joined Exam
* Left Exam
* Suspicious Activity Detected
* Exam Submitted

Different systems want to be notified of these changes.

---

## Requirements

### 1. Subject Interface

Create an interface `StudentSubject` with methods:

```
addObserver(Observer o)
removeObserver(Observer o)
notifyObservers()
```

---

### 2. Observer Interface

Create an interface `Observer` with method:

```
update(String studentId, String status)
```

---

## Concrete Subject

Implement a class `StudentExamSession` that:

* Stores:

  * studentId
  * currentStatus
* Notifies observers whenever the student's status changes

Required method:

```
setStatus(String status)
```

This method must automatically call `notifyObservers()`.

---

## Concrete Observers

Implement at least three observers:

* `ProctorDashboard` → logs all student activities
* `AutoWarningSystem` → triggers warning on suspicious activity
* `AuditLogger` → stores exam activity history

Each observer should react differently.

---

## Functional Constraints

* Observers can dynamically subscribe/unsubscribe
* Notification must occur instantly on status change
* Subject must not directly reference concrete observers
* Use only push-based updates

---

## Edge Cases

* No observers registered
* Same observer registered multiple times
* Observer removed during notification
* Repeated status updates with same value

---

## Sample Output

```
[Dashboard] Student S123 marked as: Joined Exam
[Audit] Recorded status change for S123
[Warning] Suspicious activity detected for S123
```

---

## Bonus Challenge

Notify observers only if the status change is critical (e.g. "Suspicious Activity" or "Left Exam")

---

## Objective

Design the system so that:

* Adding new monitoring systems does NOT change StudentExamSession
* Components remain loosely coupled
* No type-checking logic exists in the subject

If your StudentExamSession knows what a ProctorDashboard is, you missed the point entirely.
