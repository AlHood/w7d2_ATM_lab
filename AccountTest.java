import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

Account account;

@Before
public void before() {
 account = new Account(1001, 500);

}

@Test
public void canWithdrawFunds() {
int check = account.withdrawFunds(250);
assertEquals(250, check);

}

}