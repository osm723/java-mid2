package collection.compare.test0;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getNumber() < o2.getNumber()) {
            return -1;
        } else if (o1.getNumber() > o2.getNumber()) {
            return 1;
        } else {
            return o1.getShape().compareTo(o2.getShape());
        }
    }
}
