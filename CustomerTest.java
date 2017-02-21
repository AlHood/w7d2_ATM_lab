import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

  Customer customer; 
  Bank bank;
  Account account;
 int result;
String stringResult;

  @Before
  public void before() {
    customer = new Customer("Ivan", 1001, 0);
    bank = new Bank();

    account = new Account(1001, 500);
    bank.addAccount(account);

  }

  @Test
  public void canPlaceCashInWallet() {
    customer.placeCashInWallet(250);
    assertEquals(250, customer.checkWallet());
  }

@Test
public void canAuthenticate() {
stringResult = customer.authenticate(bank);
assertEquals("Account verified", stringResult);
}

@Test
public void canDoTheThing() {
customer.requestCash(100, bank);
result = customer.checkWallet();
assertEquals(100, result);
}

}