import java.util.HashMap;

public class Customer {

private int accountCard;
private int wallet;
private String name;
private int response;
private int number;

public Customer(String name, int accountCard, int wallet) { 
  this.accountCard = accountCard;
  this.wallet = wallet; 
  this.name = name;
}

public void placeCashInWallet(int cash) {
this.wallet += cash;
}

public int checkWallet() {
return this.wallet;
}

public String authenticate(Bank bank){
  number = this.accountCard;
  return bank.authenticate(number);

}

public void requestCash(int request, Bank bank) {
 response = bank.requestedCash(request, this.accountCard);

if (response > 0) {

  placeCashInWallet(response);
}

}






}
 
