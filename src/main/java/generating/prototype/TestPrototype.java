package generating.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {

    public static void main(String[] args) {
        GoldMetal goldMetal = new GoldMetal(10, 10, 100);
        SilverMetal silverMetal = new SilverMetal(20, 20, 200);
        GoldMetal anotherGoldMetal = goldMetal.clone();
        SilverMetal anotherSilverMetal = silverMetal.clone();
        List<PreciousMetal> preciousMetals = new ArrayList<PreciousMetal>();
        preciousMetals.add(goldMetal);
        preciousMetals.add(silverMetal);
        preciousMetals.add(anotherGoldMetal);
        preciousMetals.add(anotherSilverMetal);

        preciousMetals.forEach(System.out::println);
    }

}
