package collection.compare.test0;

import java.util.*;

public class CardGameMain {

    public static void main(String[] args) {
        List<Card> list = new ArrayList<>();
        //Map<String> map = new HashMap<>();
        for (int i = 0; i < 13; i++) {
            list.add(new Card("(\u2660)",i+1));
            list.add(new Card("(\u2665)",i+1));
            list.add(new Card("(\u2666)",i+1));
            list.add(new Card("(\u2663)",i+1));
        }

        for (Card s : list) {
            System.out.println(s.getShape() + s.getNumber());
        }

        System.out.println(" ============ ");

        list.sort(new CardComparator());

        for (Card s : list) {
            System.out.println(s.getShape() + s.getNumber());
        }

        Collections.shuffle(list);
        System.out.println(" player1 ============ ");
        for (int i = 0; i < 5; i++) {
            Card player1Card = list.get(i);
            System.out.print(player1Card.getNumber()+player1Card.getShape());
        }

        System.out.println();
        Collections.shuffle(list);
        System.out.println(" player2 ============ ");
        for (int i = 0; i < 5; i++) {
            Card playerCard = list.get(i);
            System.out.print(playerCard.getNumber()+playerCard.getShape());
        }

    }
}
