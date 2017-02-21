

public class Account {


private int accNum;
private int balance;
private int withdrawalLimit;

public Account(int accNum, int balance) {

this.accNum = accNum;
this.balance = balance;
this.withdrawalLimit = 250;
}

public int withdrawFunds(int value) {
balance = balance - value;
  return value;
}

public int getAccNum() {
  return this.accNum;
}

}







