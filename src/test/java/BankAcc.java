import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAcc {

    private BankAcc bankAcc;

    @BeforeEach
    public void setUp() {
        bankAcc = new BankAcc();
    }

    @Test
    public void canDeposit() {
        Integer expected = 1000;
        Integer actual = bankAcc.deposit();

    }




}
