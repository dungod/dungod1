public class StrategyPatternDemo {
    public static void main(String args[]) {
        System.out.println("距离小于100km时：");
        ConcreteStrategy concreteStrategy1 = new ConcreteStrategy(new StrategyCar());
        concreteStrategy1.doOperation();
        System.out.println("距离小于500km时：");
        ConcreteStrategy concreteStrategy2 = new ConcreteStrategy(new StrategyTrain());
        concreteStrategy2.doOperation();
        System.out.println("距离大于500km时：");
        ConcreteStrategy concreteStrategy3 = new ConcreteStrategy(new StrategyPlane());
        concreteStrategy3.doOperation();
    }
}
