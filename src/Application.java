import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        Set<Integer> lockers = new TreeSet<>();
        for (int n = 0, m = 1; n < 100; n++, m++) {
            lockers.add(m);
        }
        System.out.println("Hello!" +
                "\nIn order to select a locker please enter 1." +
                "\nIn order to free up a locker enter 2." +
                "\nTo exit press 0!");

    }
}
