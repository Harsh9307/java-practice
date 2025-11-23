package RoboSim;

public class Robot {
    TalkBehavior talkBehavior;
    WalkBehavior walkBehavior;
    FlyBehavior flyBehavior;

    public void performTalk() {
        talkBehavior.talk();
    }

    public void performWalk() {
        walkBehavior.walk();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setTalkBehavior(TalkBehavior talkBehavior) {
        this.talkBehavior = talkBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    public TalkBehavior getTalkBehavior() {
        return this.talkBehavior;
    }
}
