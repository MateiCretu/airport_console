public class UserActivity {
    //metoda pentru calculul dulapului

    private long payment(long timeSpent) {
        int sumToPay = 0;
        if (timeSpent <= 60) {
            sumToPay = 10;
            System.out.println("You must pay: " + sumToPay + " RON.");
        }
        else {
            sumToPay = (int) (10 + timeSpent / 60 * 5);
            System.out.println("You must pay: " + sumToPay + " RON.");
        }
        return sumToPay;
    }

    public static void main(String[] args) {
        UserActivity user = new UserActivity();
        user.payment(270);
    }

}
