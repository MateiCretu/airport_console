import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Application {


    public static void main(String[] args) {
        UserActivity user = new UserActivity();
        Scanner inputUser = new Scanner(System.in);

        Map<Integer, Locker> lockersMap = new HashMap<>();

        for (int lockerId = 1; lockerId <= 100; lockerId++) {
            Locker locker = new Locker(lockerId);
            lockersMap.put(lockerId, locker);
        }

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
                System.out.println(lockersMap.values().stream().filter(locker -> !locker.isLocked()).collect(Collectors::toList());
                int lockerId = inputUser.nextInt();

                while (!lockersMap.containsKey(lockerId) || lockersMap.get(lockerId).isLocked()) {
                    System.out.println("Please choose an available locker!");
                    lockerId = inputUser.nextInt();
                }
                Locker locker = lockersMap.get(lockerId);
                locker.setLocked(true);

                System.out.println("Please set up a 4 digit pin-code");

                locker.setLockerPin(inputUser.next());

                while (locker.getLockerPin().length() != 4) {
                    System.out.println("Pin code must have 4 digits! Please retry!");
                    locker.setLockerPin(inputUser.next());
                }

                locker.setTime(LocalDateTime.now());

                System.out.println("Your reserved " + locker + " at " + locker.getTime() + " local time.\n");
            }

            else {

                System.out.println("Please enter your locker number:");
                int lockerId = inputUser.nextInt();
                while (!lockersMap.containsKey(lockerId) || lockersMap.get(lockerId).isLocked()) {
                    System.out.println("Please enter correct locker number!");
                    lockerId = inputUser.nextInt();
                }

                System.out.println("Please enter your pin:");
                String pinByUser = inputUser.next();
                Locker locker = lockersMap.get(lockerId);
                while (!pinByUser.equals(locker.getLockerPin()) && !idByUser.equals(locker.getLockerId())) {
                    System.out.println("Please enter the correct PIN number!");
                    pinByUser = inputUser.next();
                }

                long time = user.spentTime(LocalDateTime.now(), locker.getTime());

                System.out.println("You occupied the locker for: " + time + " minutes.");

                user.payment(time);
                locker.setLocked(false);
                locker.setTime(null);
            }

        }
        while (optToLockers != 0);


    }

}
