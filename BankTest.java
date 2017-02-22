import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

Bank bank;
Customer customer;
Atm aTM;
Account account; 
int result;
String stringResult;

  @Before
  public void before() {
bank = new Bank();
account = new Account(1500, 500);
bank.addAccount(account);
customer = new Customer("Katarina", 1500, 0);
}

@Test
public void test_requestedCash(){
result = bank.requestedCash(150, 1500);
assertEquals(150, result);

}

@Test
public void test_authenticate() {
stringResult = bank.authenticate(1500);
assertEquals("Account verified", stringResult);

}




  }