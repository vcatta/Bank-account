public class Main {
    public static void main(String[] args) {

        SettlementAccount myAccount = new SettlementAccount();
        DepositAccount myDeposit = new DepositAccount();
        CardAccount myCard = new CardAccount();

        myDeposit.addMoney(10000);
        myDeposit.takeAwayMoney(5000);
        myDeposit.takeAwayMoney(2000);
        myDeposit.takeAwayMoney(1000);

       myAccount.addMoney(10000);
       myAccount.takeAwayMoney(2000);


       myCard.addMoney(25000);
       myCard.takeAwayMoney(20000);


    }
}
