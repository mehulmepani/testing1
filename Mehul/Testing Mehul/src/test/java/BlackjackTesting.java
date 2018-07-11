import org.junit.Test;
import static org.junit.Assert.*;
public class BlackjackTesting {

    @Test
    public void test() {
        blackjack2  blackjack = new blackjack2();
        assertEquals(22, blackjack2.blackjack(22, 22));
        assertEquals(15, blackjack2.blackjack(15, 22));
        assertEquals(18, blackjack2.blackjack(10, 18));
        assertEquals(21, blackjack2.blackjack(21, 5));
    }

    @Test
    public void test2() {
        assertEquals(20, blackjack2.blackjack(13,20));
    }

}
