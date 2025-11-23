# Problem: Smart Notification System using Strategy + Observer Pattern

## Overview

You are building a **Smart Notification System** for an online platform. Users want to receive alerts when system events occur, but the way notifications are delivered should be changeable at runtime.

This system must combine:

* **Observer Pattern** → decides *who* gets notified
* **Strategy Pattern** → decides *how* the notification is sent

---

## Scenario

The platform triggers events such as:

* New Login Detected
* Password Changed
* Suspicious Activity
* Account Locked

Users subscribe to these events. When an event occurs, all subscribed users are notified using their preferred notification method.

---

## Observer Responsibilities

### Subject Interface

Create a subject interface with:

```
registerObserver(Observer o)
removeObserver(Observer o)
notifyObservers(String event)
```

### Observer Interface

Create an observer interface with:

```
update(String event)
```

---

## Strategy Responsibilities

### NotificationStrategy Interface

Define a strategy interface:

```
sendNotification(String message)
```

---

## Concrete Strategies

Implement at least three notification strategies:

* `EmailNotification`
* `SMSNotification`
* `PushNotification`

Each strategy should simulate different delivery logic.

---

## Concrete Observer: User

Each User:

* Subscribes to the Event Manager
* Holds a `NotificationStrategy`
* Can change strategy dynamically at runtime

Example:

```
user.setNotificationStrategy(new SMSNotification());
```

The User must use its strategy inside the `update()` method to send notifications.

---

## Concrete Subject: EventManager

* Maintains a list of subscribed users
* Triggers notifications when an event occurs

Required method:

```
triggerEvent(String event)
```

This must internally call `notifyObservers(event)`

---

## Flow Logic

1. EventManager detects an event
2. All registered users are notified
3. Each user uses its own NotificationStrategy to deliver the message

---

## Sample Output

```
[EMAIL] User A notified: Suspicious Activity detected
[SMS] User B notified: Suspicious Activity detected
[PUSH] User C notified: Suspicious Activity detected
```

User B switches delivery method:

```
userB.setNotificationStrategy(new PushNotification());
```

Next event:

```
[PUSH] User B notified: Account Locked
```

---

## Edge Cases to Handle

* User without a strategy
* No observers registered
* Strategy switched during runtime
* Null or empty event message

---

## Bonus Challenge

Introduce event priority levels:

* **CRITICAL** → Force SMS regardless of user strategy
* **NORMAL** → Use user-selected strategy

---

## Objective

Design the system so that:

* EventManager does NOT care how users are notified
* Users do NOT care who triggered the event
* Notification strategies are fully replaceable at runtime
* No conditional logic based on notification types exists in EventManager

If your solution uses `if(notificationType == ...)` or similar logic, the architecture has failed beautifully.
