import java.time.LocalDateTime;
import java.util.*;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        UserActivity user = new UserActivity();
        Locker locker = new Locker();

        Scanner inputUser = new Scanner(System.in);

        Set<Integer> lockersAvailable = new TreeSet<>();
        for (int n = 0, m = 1; n < 100; n++, m++) {
            lockersAvailable.add(m);
        }

        Map<Integer, LocalDateTime> lockersTimeMap = new HashMap<>();

        System.out.println("Hello! In order to choose a locker. please press 1");
        int optToLockers = inputUser.nextInt();
        do {

            System.out.println("Please choose a locker!");
            user.userLockerId(locker, inputUser.nextInt());

            System.out.println("Please set up a 4 digit pin-code");
            user.userLockerPin(locker, inputUser.next());

            lockersTimeMap.put(locker.getLockerId(), LocalDateTime.now());

            System.out.println("Your locker set up is: " + locker + "reserved at " + lockersTimeMap.get(locker.getLockerId()) + " local time.");

            lockersAvailable.remove(locker.getLockerId());

            System.out.println(lockersAvailable);

            System.out.println(lockersTimeMap);

            //Thread.sleep(62000);

            long time = user.spentTime(LocalDateTime.now(), lockersTimeMap.get(locker.getLockerId()));
            System.out.println("You occupied the locker for: " + time + " minutes.");
            user.payment(time);
        } while (optToLockers == 1);


    }
}
