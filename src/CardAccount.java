public class CardAccount extends SettlementAccount {

    @Override
    public void takeAwayMoney(double sumRemoval) {
        double commission = 0.01;
        super.takeAwayMoney(sumRemoval * (1 + commission));
        System.out.println("В сумму выдачи вошла комиссия: " + sumRemoval * commission + " руб.");
    }
}
