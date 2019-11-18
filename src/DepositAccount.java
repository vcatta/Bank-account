import java.util.Calendar;

public class DepositAccount extends SettlementAccount {

    private Calendar calendarAddition;

    @Override
    public void addMoney(double sumAddition) {
        super.addMoney(sumAddition);
        calendarAddition = Calendar.getInstance();
    }

    @Override
    public void takeAwayMoney(double sumRemoval) {

        Calendar calendarToday = Calendar.getInstance();
        Calendar checkingCalendar = Calendar.getInstance();

        checkingCalendar.setTime(calendarAddition.getTime());
        checkingCalendar.add(Calendar.MONTH, 1);

        if(calendarToday.before(checkingCalendar))
        {
            System.out.println("Снятие невозможно!");
        }
        else {
            super.takeAwayMoney(sumRemoval);
        }
    }
}
