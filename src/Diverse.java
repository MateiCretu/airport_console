import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Diverse {
/*    public static void main(String[] args) throws InterruptedException {
        Set<Integer> lockers = new TreeSet<>();
        for (int n = 0, m = 1; n < 100; n++, m++) {
            lockers.add(m);
        }

        System.out.println(lockers.size());

        Map<Integer, LocalTime> lockerTimeMap = new HashMap<>();

        Locker locker = new Locker(1, "1001");
        Locker locker2 = new Locker(2, "1002");
        lockerTimeMap.put(locker.getLockerId(), LocalTime.now());

        Thread.sleep(2000);

        lockerTimeMap.put(locker2.getLockerId(), LocalTime.now());

        Thread.sleep(2000);
        System.out.println(lockerTimeMap);

        LocalTime time1 = lockerTimeMap.get(locker.getLockerId());
        LocalTime time2 = lockerTimeMap.get(locker2.getLockerId());
        System.out.println(time1 + "\n" + time2);

        Thread.sleep(2000);

        long timePassed = ChronoUnit.SECONDS.between(time1, LocalTime.now());

        System.out.println(timePassed);


        System.out.println("Hello!" +
                "\nIn order to select a locker please enter 1." +
                "\nIn order to free-up a locker enter 2." +
                "\nTo exit press 0!");
        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();

        //int idChoice = scanner.nextInt();
        //int idLocker = scanner.nextInt();
        //int pinLocker = scanner.nextInt();

        while (userChoice != 0) {
            if (userChoice == 1) {
                System.out.println("Please choose o locker number from below");
                System.out.println(lockers);

                break;
            }
            if (userChoice == 2) {
                System.out.println("Please enter your locker number!");

                //de validat ca id-ul introdus este corect, deja ocupat
                System.out.println("Please enter your PIN code");

                //de validat ca id-ul si pin-ul apartin aceluiasi dulap
                break;

            }
            if (userChoice != 1 || userChoice != 2 || userChoice != 0) {
                System.out.println("Please enter '1', '2' or '0'!");
            }
        }

    }*/
}

