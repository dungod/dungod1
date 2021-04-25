public class abstractFactoryDemo {
    public static void main(String[] args) {
        abstractFactory fac1=factoryProducer.getFactory("furnitureFactory");
        abstractFactory fac2=factoryProducer.getFactory("colorFactory");
        Furniture fur1=fac1.getFurniture("Desk");
        Color col1=fac2.getColor("Blue");
        fur1.draw();
        col1.fill();
    }
}
