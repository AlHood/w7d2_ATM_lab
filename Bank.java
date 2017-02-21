import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

  private ArrayList<Account> accounts;
  private Atm atm;
  private HashMap<String, Integer> msg;

  public Bank() {
    accounts = new ArrayList<Account>();
    atm = new Atm(); 
  }

  public void addAccount(Account addedAccount) {
    accounts.add(addedAccount);
  }

  public String authenticate(int accountCard) {
    for (Account account : accounts) {
      if (account.getAccNum() == accountCard) {
        return "Account verified" ;

      }}
      return "Unable to verify account.";
    }

    public int requestedCash(int request, int accountCard) {
      for (Account account : accounts) {
        if (account.getAccNum() == accountCard) {
          int request2 = account.withdrawFunds(request);

          return this.atm.deliverCash(request2);

        }}
        return 0;
      }




    }