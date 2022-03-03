import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class UserActivity {

    //method to calculate time
    public long spentTime(LocalDateTime actual, LocalDateTime reservedTime) {
        return ChronoUnit.MINUTES.between(reservedTime, actual);
    }

    //method to calculate payment
    public int payment(long timeSpent) {
        int sumToPay = (int) (10 + (timeSpent - 60) / 60 * 5);
        if (timeSpent < 61)
            sumToPay = 10;

        System.out.println("You must pay: " + sumToPay + " RON.");
        return sumToPay;
    }

}
