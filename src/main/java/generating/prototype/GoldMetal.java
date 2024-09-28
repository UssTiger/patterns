package generating.prototype;

public class GoldMetal extends PreciousMetal{

    public GoldMetal(int height, int width, int count) {
        super(height, width, count);
    }

    @Override
    public GoldMetal clone() {
        return new GoldMetal(this.getHeight(), this.getWidth(), this.getCount());
    }

}
