package generating.prototype;

public abstract class PreciousMetal {

    public int height; // высота

    public int width; // ширина

    public int count; // колличество

    public PreciousMetal() {
    }

    public PreciousMetal(int height, int width, int count) {
        this.height = height;
        this.width = width;
        this.count = count;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getCount() {
        return count;
    }

    public abstract PreciousMetal clone();

    @Override
    public String toString() {
        return "PreciousMetal {" +
                "height=" + height +
                ", width=" + width +
                ", count=" + count +
                '}';
    }
}
