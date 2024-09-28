package generating.prototype;

public class SilverMetal extends PreciousMetal{

    public SilverMetal(int height, int width, int count) {
        super(height, width, count);
    }

    @Override
    public SilverMetal clone() {
        return new SilverMetal(this.getHeight(), this.getWidth(), this.getCount());
    }

}
