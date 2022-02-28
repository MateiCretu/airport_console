import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {

        int id = 10;
        int pin = 1010;
        Locker locker = new Locker(id, pin, LocalTime.now());
        System.out.println(locker);
    }
}
