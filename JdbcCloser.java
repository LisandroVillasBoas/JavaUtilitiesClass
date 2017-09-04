package connectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lisandro Villas Bôas
 */

public class JdbcCloser {

    public static void closeResultset(ResultSet... resultSets) {
        if (resultSets == null) {
            return;
        }
        for (ResultSet resultSet : resultSets) {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void closeStatement(Statement... statements) {
        if (statements == null) {
            return;
        }
        for (Statement statement : statements) {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void closeConnection(Connection... connections) {
        if (connections == null) {
            return;
        }
        for (Connection connection : connections) {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Connection Closed...");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
///////////////////////////////Managed Bean/////////////////////////////////////////////////
/*
            Connection con = null;
            Statement stmt = null;
            ResultSet res = null;
               finally {
                    JdbcCloser.closeResultset(res);
                    JdbcCloser.closeStatement(stmt);
                    JdbcCloser.closeConnection(con);
                       }
*/
////////////////////////////////////////////////////////////////////////////////////////////