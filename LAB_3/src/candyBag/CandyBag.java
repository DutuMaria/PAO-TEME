package candyBag;

import candyBox.CandyBox;

public class CandyBag {
    private CandyBox[] candyBox;

    public CandyBag() {}
    public CandyBag(CandyBox[] candyBox) {
        this.candyBox = candyBox;
    }

    public CandyBox[] getCandyBox() { return candyBox; }
    public void setCandyBox(CandyBox[] candyBox) { this.candyBox = candyBox; }
}
