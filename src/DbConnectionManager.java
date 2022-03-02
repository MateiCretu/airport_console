import org.sqlite.SQLiteConfig;

import java.sql.*;

public class DbConnectionManager {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sqlite:I:\\java_stuff\\Locker_App\\AirportLockersConsole.db";
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        Connection conn = DriverManager.getConnection(url, config.toProperties());
        String sql = "select * from lockers";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("ID");

            int lockerNo = resultSet.getInt("LockerNO");
            String pin = resultSet.getString("LockerPIN");
            String entry = resultSet.getString("EntryTime");
            String exit = resultSet.getString("ExitTime");
            int time = resultSet.getInt("SpentTime");
            int pay = resultSet.getInt("Payment");


            System.out.println("id: " + id + " locker: " + lockerNo + " pin: " + pin +
                    " entry: " + entry + " exit: " + exit + " time: " + time +
                    " pay: " + pay);
        }


    }
}
