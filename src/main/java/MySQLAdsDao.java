import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;
    private List<Ad> ads;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public List<Ad> generateAds() {
        List<Ad> output = new ArrayList<>();
        String query = "SELECT * FROM AD";

        try {
            //reference connection in statement
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                //add a new contact for each record iterating over
                output.add(
                        new Ad(
                                rs.getInt("id"),
                                rs.getInt("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    @Override
    public Long insert(Ad ad) {
        String insertQuery = String.format("INSERT INTO ad (user_id, title, description) VALUES (%d, '%s', '%s')",
                1,
                ad.getTitle(),
                ad.getDescription()
        );
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet newSet = statement.getGeneratedKeys();
        if (newSet.next()) {
            System.out.println("Inserted id is: " + newSet.getLong(1));
            return newSet.getLong(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return null;
    }
}
