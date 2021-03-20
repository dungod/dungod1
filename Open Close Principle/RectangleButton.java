public class RectangleButton implements Button {
    private int length;//长
    private int width;//宽

    public RectangleButton(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getgirth() {
        return (length + width) * 2;
    }

    @Override
    public int getarea() {
        return length * width;
    }
}
