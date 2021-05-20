package Test;

public class Cat extends Observer{
    public Cat(Subject subject)
    {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("喵喵喵！");
    }
}
