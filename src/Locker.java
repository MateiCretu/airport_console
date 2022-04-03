import java.time.LocalDateTime;
import java.util.Objects;

public class Locker {
    private final int lockerId;
    private String lockerPin;
    private boolean locked;
    private LocalDateTime time;

    public Locker(int lockerId) {
        this.lockerId = lockerId;
    }

    public int getLockerId() {
        return lockerId;
    }

    public String getLockerPin() {
        return lockerPin;
    }

    public void setLockerPin(String lockerPin) {
        this.lockerPin = lockerPin;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locker locker = (Locker)o;

        if (lockerId != locker.lockerId) return false;
        if (locked != locker.locked) return false;
        if (!Objects.equals(lockerPin, locker.lockerPin)) return false;
        return Objects.equals(time, locker.time);
    }

    @Override
    public int hashCode() {
        int result = lockerId;
        result = 31 * result + (lockerPin != null ? lockerPin.hashCode() : 0);
        result = 31 * result + (locked ? 1 : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Locker " + lockerId;
    }
}
