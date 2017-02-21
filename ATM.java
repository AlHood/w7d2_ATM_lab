

public class Atm {

private int cashReserve;


public Atm() {
this.cashReserve = 500;

}



public void fillUp() {
this.cashReserve = 500;
}

public int deliverCash(int value) {
this.cashReserve = cashReserve - value;
return value;
}

public int reportCashReserve() {
return this.cashReserve;

}

}

