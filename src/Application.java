import java.time.LocalDateTime;
import java.util.*;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Scanner inputUser = new Scanner(System.in);
        Set<Integer> lockersAvailable = new TreeSet<>();
        for (int n = 0, m = 1; n < 100; n++, m++) {
            lockersAvailable.add(m);
        }
        Map<Integer, LocalDateTime> lockersTimeMap = new HashMap<>();
        String pin = "0000";
        int choice;
        do {
            choice = inputUser.nextInt();
        } while (choice == 1 || choice == 2 || choice == 0);
    }




}
