public class blackjack2 {

    public blackjack2() {
    }

    public static int blackjack(int card1, int card2) {
        if (card1 <= 21 & card2 <= 21) {
            if (card1 > card2) {
                return card1;
            }

            if (card2 > card1) {
                return card2;
            }
        } else {
            if (card1 >= 22) {
                return card2;
            }

            if (card2 >= 22) {
                return card1;
            }
        }

        return 0;
    }
}
