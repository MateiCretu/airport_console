public class Locker {
    private int lockerId;
    private String lockerPin;

    public Locker(int lockerId, String lockerPin) {
        this.lockerId = lockerId;
        this.lockerPin = lockerPin;
    }

    public int getLockerId() {
        return lockerId;
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public String getLockerPin() {
        return lockerPin;
    }

    public void setLockerPin(String lockerPin) {
        this.lockerPin = lockerPin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locker locker = (Locker) o;

        if (lockerId != locker.lockerId) return false;
        return lockerPin.equals(locker.lockerPin);
    }

    @Override
    public int hashCode() {
        int result = lockerId;
        result = 31 * result + lockerPin.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Locker{" +
                "locker number = " + lockerId +
                ", locker PIN = " + lockerPin +
                '}';
    }
}
