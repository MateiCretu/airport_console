import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserActivityTest {

    UserActivity activity;
    Locker locker;

    @BeforeEach
    void setUp() {
        activity = new UserActivity();
        locker = new Locker();
    }

    @Test
    void userLockerId() {

        activity.userLockerId(locker, 100);
        assertEquals(100, locker.getLockerId());
    }

    @Test
    void userLockerPin() {
        activity.userLockerPin(locker, "1204");
        assertEquals("1204", locker.getLockerPin());
    }

    @Test
    void spentTime() {
    }

    @Test
    void payment() {
        assertEquals(((365 - 60) / 60 * 5 + 10), activity.payment(365));
        assertEquals(((425 - 60) / 60 * 5 + 10), activity.payment(425));


    }
}