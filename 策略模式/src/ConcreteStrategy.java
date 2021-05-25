public class ConcreteStrategy {
    private Strategy strategy;
    public ConcreteStrategy(Strategy strategy)
    {
        this.strategy=strategy;
    }
    public void doOperation()
    {
        strategy.doOperation();
    }
}
