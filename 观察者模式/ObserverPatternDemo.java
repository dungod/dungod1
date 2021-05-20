package Test;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject=new Subject() ;
        Dog dog=new Dog(subject);
        Cat cat=new Cat(subject);
        subject.detach();
    }
}
