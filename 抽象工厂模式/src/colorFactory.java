public class colorFactory extends abstractFactory{
    public Color getColor(String s)
    {
       if(s.equalsIgnoreCase("Red"))
       {
           return new Red();
       }
        if(s.equalsIgnoreCase("Blue"))
        {
            return new Blue();
        }
        if(s.equalsIgnoreCase("Green"))
        {
            return new Green();
        }
       else return null;
    }
    public Furniture getFurniture(String s)
    {
        return null;
    }
}
