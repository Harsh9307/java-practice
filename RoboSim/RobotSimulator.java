package RoboSim;

public class RobotSimulator {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setFlyBehavior(new RocketFly());
        robot.setWalkBehavior(new BriskWalk());
        robot.performFly();
        robot.setFlyBehavior(new RocketFly());
        robot.performFly();
    }
}
