package Ch4;

/**
 * Created by Iwan on 12.12.2015.
 */
public class BookwormOracle implements  Oracle {
      private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    public String defineMeaningOfLife() {
        return "Encyclopedia are a wast of maney - use the Internet";
    }
}
