public class furnitureFactory extends abstractFactory{
    public Color getColor(String s)
    {
        return null;
    }
    public Furniture getFurniture(String s)
    {
        if(s.equalsIgnoreCase("Chair"))
        {
            return new Chair();
        }
        if(s.equalsIgnoreCase("Desk"))
        {
            return new Desk();
        }
        if(s.equalsIgnoreCase("Bed"))
        {
            return new Bed();
        }
        else return null;
    }
}
