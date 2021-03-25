public class CircleButton implements Button {
    private int radius;

    public CircleButton(int radius) {
        this.radius = radius;
    }

    @Override
    public int getarea() {
        return 3 * radius * radius;
    }

    @Override
    public int getgirth() {
        return 3 * 2 * radius;
    }
}
