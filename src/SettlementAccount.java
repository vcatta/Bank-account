public class SettlementAccount {

    private double balance;


    public SettlementAccount()
    {
      balance = 0;
    }

    public void addMoney(double sumAddition)
    {
        balance += sumAddition;
        System.out.println("На счет зачислено " + sumAddition + " руб.");
    }

    public void takeAwayMoney(double sumRemoval)
    {
        if(balance == 0 | sumRemoval > balance)
        {
            System.out.println("Недостаточно средств для снятия!");
        }
        else
        {
            balance -= sumRemoval;
            System.out.println("Сумма выдачи: " + sumRemoval + " руб. Баланс: " + getBalance() + " руб.");
        }
    }

    public double getBalance()
    {
        return balance;
    }


}
