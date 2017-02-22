import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

  Customer customer; 
  Bank bank;
  Account account;
 int result;
String stringResult;
Customer customer2;

  @Before
  public void before() {
    customer = new Customer("Ivan", 1001, 0);
    bank = new Bank();

    account = new Account(1001, 500);
    bank.addAccount(account);
    customer2 = new Customer("Vlad", 999, 50);

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

@Test 
public void customerIsAWrongUn() {
customer2.requestCash(100, bank);
result = customer2.checkWallet();
assertEquals(50, result);
}

@Test
public void ivanGetsGreedy() {
customer.requestCash(400, bank);
result = customer.checkWallet();
assertEquals(0, result);

}

@Test
public void canCheckWallet() {
result = customer2.checkWallet();
assertEquals(50, result);
}

@Test
public void canPlaceCashInWalletCorrectly() {
  customer2.placeCashInWallet(250);
  assertEquals(300, customer2.checkWallet());
}

}