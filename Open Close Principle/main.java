public class main {
    public static void main(String[] args) {
        CircleButton circleButton = new CircleButton(3);
        RectangleButton rectangleButton = new RectangleButton(3, 4);
        System.out.println("圆形的面积是：" + circleButton.getarea());
        System.out.println("圆形的周长是：" + circleButton.getgirth());
        System.out.println("长方形的面积是：" + rectangleButton.getarea());
        System.out.println("长方形的周长是：" + rectangleButton.getgirth());
    }
}
