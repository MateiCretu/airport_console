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


        int optToLockers;
        do {
            System.out.println(
                    "Hello!" +
                            "\nIn order to choose a locker, please press 1." +
                            "\nIn order to free-up a locker, please press 2." +
                            "\nTo exit, press 0.");

            optToLockers = inputUser.nextInt();

            while (optToLockers != 1 && optToLockers != 2 && optToLockers != 0) {
                System.out.println("Please enter a valid option");
                optToLockers = inputUser.nextInt();
            }

            if (optToLockers == 1) {
                System.out.println("Please choose a locker from the list:");
                System.out.println(lockersAvailable);

                locker.setLockerId(inputUser.nextInt());

                while (!lockersAvailable.contains(locker.getLockerId())) {
                    System.out.println("Please choose a free locker!");
                    locker.setLockerId(inputUser.nextInt());
                }

                lockersAvailable.remove(locker.getLockerId());

                System.out.println("Please set up a 4 digit pin-code");

                locker.setLockerPin(inputUser.next());

                while (locker.getLockerPin().length() != 4) {
                    System.out.println("Pin code must have 4 digits! Please retry!");
                    locker.setLockerPin(inputUser.next());
                }

                lockersTimeMap.put(locker.getLockerId(), LocalDateTime.now());
                lockersIdPinMap.put(locker.getLockerId(), locker.getLockerPin());

                System.out.println("Your reserved your locker at " + lockersTimeMap.get(locker.getLockerId()) + " local time.\n");
            }

            if (optToLockers == 2) {

                System.out.println("Please enter your locker number:");
                int idByUser = inputUser.nextInt();

                while (!lockersIdPinMap.containsKey(idByUser)) {
                    System.out.println("Please enter correct locker number!");
                    idByUser = inputUser.nextInt();
                }

                System.out.println("Please enter your pin:");
                String pinByUser = inputUser.next();

                while (!pinByUser.equals(lockersIdPinMap.get(idByUser))) {
                    System.out.println("Please enter the correct PIN number!");
                    pinByUser = inputUser.next();
                }

                long time = user.spentTime(LocalDateTime.now(), lockersTimeMap.get(idByUser));

                System.out.println("You occupied the locker for: " + time + " minutes.");

                user.payment(time);

                lockersIdPinMap.remove(idByUser);
                lockersTimeMap.remove(idByUser);
                lockersAvailable.add(idByUser);
            }

        } while (optToLockers != 0);
    }
}
