import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class UserActivity {

    //method to set locker ID
    public void userLockerId(Locker locker, int id) {
        locker.setLockerId(id);
    }

    //method to set locker pin cod
    public void userLockerPin(Locker locker, String code) {
        locker.setLockerPin(code);
    }
    //method to calculate time

    public long spentTime(LocalDateTime actual, LocalDateTime reservedTime) {
        return ChronoUnit.MINUTES.between(reservedTime, actual);
    }


    //method to calculate payment
    public void payment(long timeSpent) {
        int sumToPay = (int) (10 + timeSpent / 60 * 5);
        System.out.println("You must pay: " + sumToPay + " RON.");
    }

    public static void main(String[] args) {
        UserActivity user = new UserActivity();
        user.payment(59);
    }

}
