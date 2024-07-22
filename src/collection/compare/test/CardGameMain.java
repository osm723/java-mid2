package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2);

        if (winner != null) {
            System.out.println("승리자 = " + winner.getName());
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        //Player winner;
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
            //winner = player1;
            return player1;
        } else if (sum1 == sum2) {
            //winner = null;
            return null;
        } else {
            //winner = player2;
            return player2;
        }
        //return winner;
    }
}
