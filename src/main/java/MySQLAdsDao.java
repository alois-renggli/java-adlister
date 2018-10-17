import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;


public class MySQLAdsDao implements Ads{
    private Connection connection;
    Config config = new Config();


    public MySQLAdsDao() throws SQLException {
        try{
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        }catch(SQLException e){

        }
 }

    @Override
    public List<Ad> all() {
        String query = "SELECT * FROM ads;";
        List<Ad> ads = new ArrayList<>();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                ads.add(createAdObject(rs));
            }
            return ads;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Ad createAdObject(ResultSet rs){
        try {
            return new Ad(rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Long insert(Ad ad) {
        String query = String.format("INSERT INTO ads(user_id, title, description) " +
                "values('%s','%s','%s');",ad.getUserId(), ad.getTitle(), ad.getDescription());
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                return rs.getLong(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }


        return null;
    }

//    Create a class named MySQLAdsDao that implements the Ads interface
//
//    This class should have a private instance property named connection of
// type Connection that is initialized in the constructor.
// Define your constructor so that it accepts an instance of your Config class
// so that it can obtain the database credentials.

//    Implement the methods in the Ads interface
//    Your methods should retrieve ads from the database and insert new ads into the
// database
//    The connection object will be created just once, in this class' constructor,
// and the individual methods that query the database should use the connection object
// to create statements.
}
