package Test;

public class Dog extends Observer{
    public Dog(Subject subject)
    {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("汪汪汪！");
    }
}