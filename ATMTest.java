import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AtmTest {

Atm aTM;

  @Before
  public void before() {
   aTM = new Atm();

  }

  @Test
  public void canDeliverCash() {
    assertEquals(250, aTM.deliverCash(250));

  }

  @Test
  public void canUpdateCashReserve() {
   aTM.deliverCash(350);
   assertEquals(150, aTM.reportCashReserve());
 }


 @Test
 public void canFillUp() {
  aTM.deliverCash(350);
  aTM.fillUp();
  assertEquals(500, aTM.reportCashReserve());
  }

}