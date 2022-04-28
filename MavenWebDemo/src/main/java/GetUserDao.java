import java.sql.*;

public class GetUserDao
{
    String url = "jdbc:postgresql://localhost:5432/database";
    String usernameDB = "postgres";
    String passwordDB = "password";

    public User getUser(int id)
    {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, usernameDB, passwordDB);
            String sql = "select * from demo_table where id=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,id);
            ResultSet rs  = st.executeQuery();
            rs.next();
            User result = new User();
            result.setId(rs.getInt("id"));
            result.setMark(rs.getInt("mark"));
            result.setPassword(rs.getString("password"));
            result.setName(rs.getString("name"));
            return  result;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException throwables) {
            System.out.println(throwables);
        }
        return null;
    }


}
