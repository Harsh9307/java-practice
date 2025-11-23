public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new MimicQuack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
