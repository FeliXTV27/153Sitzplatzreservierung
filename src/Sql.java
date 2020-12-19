import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sql {
    Connection conn;
    Guest guest = new Guest();

    private void establishConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        final String dbUrl = "jdbc:mysql://localhost/seatreservation";
        final String username = "user";
        final String password = "passwort";
        conn = DriverManager.getConnection(dbUrl, username, password);
    }

    //Guestmethods
    private void CreateGuest() throws SQLException {
        //get variables from Guest
        String firstName = guest.getFirstName();
        String surName = guest.getSurName();
        String street = guest.getStreet();
        String plzTown = guest.getPlzTown();
        String bdate = guest.getBdate();
        String tel = guest.getTel();
        String telMobile = guest.getTelMobile();
        String email = guest.getEmail();

        String query = "INSERT INTO VIPGuest (, firstName, surName, street, plzTown, bdate, tel, telMobile, email)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";


        PreparedStatement prepStatemt = conn.prepareStatement(query);
        prepStatemt.setLong(1, 1);
        prepStatemt.setString(2, "Lehner");
        prepStatemt.setString(3, "Rolf");
        prepStatemt.setDouble(4, 89000);
        prepStatemt.executeUpdate();
        prepStatemt.close();
    }

    private List<Guest> GetGuests() throws SQLException {
        Statement statement = conn.createStatement();
        String sqlStatement = "SELECT * FROM VIPGuest";
        ResultSet resultSet = statement.executeQuery(sqlStatement);
        List<Guest> guestList = new ArrayList<>();
        while(resultSet.next()) {
            Guest guest = new Guest(resultSet.getInt("id"), resultSet.getString("firstName"), resultSet.getString("surName"),
                    resultSet.getString("street"),resultSet.getString("plzTown"), resultSet.getString("bdate"),
                    resultSet.getString("tel"), resultSet.getString("telMobile"), resultSet.getString("email"));
            guestList.add(guest);
        }
        conn.close();
        return guestList;
    }
}
