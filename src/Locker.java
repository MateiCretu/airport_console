import java.time.LocalTime;

public class Locker {
    private int lockerId;
    private int lockerPin;
    LocalTime timeStamp;

    public Locker(int lockerId, int lockerPin, LocalTime timeStamp) {
        this.lockerId = lockerId;
        this.lockerPin = lockerPin;
        this.timeStamp = timeStamp;
    }

    public int getLockerId() {
        return lockerId;
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public int getLockerPin() {
        return lockerPin;
    }

    public void setLockerPin(int lockerPin) {
        this.lockerPin = lockerPin;
    }

    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locker locker = (Locker) o;

        if (lockerId != locker.lockerId) return false;
        if (lockerPin != locker.lockerPin) return false;
        return timeStamp.equals(locker.timeStamp);
    }

    @Override
    public int hashCode() {
        int result = lockerId;
        result = 31 * result + lockerPin;
        result = 31 * result + timeStamp.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Locker{" +
                "locker number = " + lockerId +
                ", locker PIN = " + lockerPin +
                ", Time = " + timeStamp +
                '}';
    }
}
