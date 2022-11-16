import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccTest {

    private BankAcc bankAcc;

        @BeforeEach
        public void setUp() {
            bankAcc = new BankAcc();
        }
        //given balance, when money, expected increase in balance
        // tests not running because of voided methods in class. need to change that.
        @Test
        public void canDeposit() {
            int expected = 1200;
            int actual = bankAcc.deposit(200);
            assertThat(expected).isEqualTo(actual);
        }

        @Test
        public void canWithdraw() {
            int expected = 1100;
            int actual = bankAcc.withdrawal(100);
            assertThat(expected).isEqualTo(actual);

        }



}
