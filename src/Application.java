import java.time.LocalDateTime;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        UserActivity user = new UserActivity();
        Locker locker = new Locker();

        Scanner inputUser = new Scanner(System.in);

        Set<Integer> lockersAvailable = new TreeSet<>();
        for (int n = 0, m = 1; n < 100; n++, m++) {
            lockersAvailable.add(m);
        }
        Map<Integer, String> lockersIdPinMap = new HashMap<>();
        Map<Integer, LocalDateTime> lockersTimeMap = new HashMap<>();

        System.out.println("Hello!" +
                "\nIn order to choose a locker, please press 1." +
                "\nIn order to free-up a locker, please press 2.");
        int optToLockers = inputUser.nextInt();
        do {
            if (optToLockers == 1) {
                System.out.println("Please choose a locker from the list:");
                System.out.println(lockersAvailable);
                user.userLockerId(locker, inputUser.nextInt());
                if (!lockersAvailable.contains(locker.getLockerId())) {
                    System.out.println("Please choose a free locker!");
                    break;
                }
                lockersAvailable.remove(locker.getLockerId());
                System.out.println("Please set up a 4 digit pin-code");
                user.userLockerPin(locker, inputUser.next());
                lockersTimeMap.put(locker.getLockerId(), LocalDateTime.now());
                lockersIdPinMap.put(locker.getLockerId(), locker.getLockerPin());
                System.out.println("Your locker is: " + locker + "reserved at " + lockersTimeMap.get(locker.getLockerId()) + " local time.");
            }
            if (optToLockers == 2) {

                System.out.println("Please enter your locker number:");
                int idByUser = inputUser.nextInt();
                if (lockersIdPinMap.containsKey(idByUser)) {
                    System.out.println("Please enter your pin:");
                    String pinByUser = inputUser.next();
                    if (pinByUser.equals(lockersIdPinMap.get(idByUser))) {
                        long time = user.spentTime(LocalDateTime.now(), lockersTimeMap.get(idByUser));
                        System.out.println("You occupied the locker for: " + time + " minutes.");
                        user.payment(time);
                    }
                    else {
                        System.out.println("Please enter the correct PIN number!");
                    }
                }
                else {
                    System.out.println("Please enter correct locker number!");
                }


            }
        } while (optToLockers == 1 || optToLockers == 2);


    }
}
