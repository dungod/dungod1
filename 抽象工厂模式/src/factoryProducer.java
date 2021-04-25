public class factoryProducer {
    public static abstractFactory getFactory(String s)
    {
       if(s.equalsIgnoreCase("furnitureFactory"))
       {
           return new furnitureFactory();
       }
       if(s.equalsIgnoreCase("colorFactory"))
        {
            return new colorFactory();
        }
       else return null;
    }
}
