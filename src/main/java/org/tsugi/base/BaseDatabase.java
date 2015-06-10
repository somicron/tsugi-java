
package org.tsugi;

import java.util.Properties;
import java.util.List;

import org.tsugi.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDatabase implements Database{

    Connection c = null;
    String prefix = null;

    /**
     * Constructor 
     */
    public void BaseDatabase(Connection c, String prefix)
    {
        this.c = c;
        this.prefix = prefix;
    }

    /**
     * Prepare and execute an SQL query and return the error
     *
     * @param sql The SQL to execute in a string.  If the SQL is badly formed this function will die.
     * @param arr An optional array of the substitition values if needed by the query
     * @param error_log Indicates whether or not errors are to be logged. Default is TRUE.
     * @return \ResultSet  This is either the real ResultSet from the query call
     * or an SQLErrror is thrown.
     */
    public ResultSet queryReturnError(String sql, String[] arr, boolean error_log)
        throws SQLException
    {
        return null;
    }

    /**
     * Prepare and execute an SQL query or die() in the attempt.
     *
     * @param sql The SQL to execute in a string.  If the SQL is badly formed this function will die.
     * @param arr An optional array of the substitition values if needed by the query
     * @return \ResultSet  This is either the real PDOStatement from the prepare() call
     * or the error is logged and a RuntimeException is thrown.
     */
    public ResultSet queryDie(String sql, String[] arr)
    {
        return null;
    }

    /**
     * Prepare and execute an SQL query and retrieve a single row.
     *
     * @param sql The SQL to execute in a string.  If the SQL is badly formed this function will die.
     * @param arr An optional array of the substitition values if needed by the query
     * @return Properties This is either the row that was returned or null if no row was returned.
     * If anything goes wrong the errors are logged and a runtime exception is thrown.
     */
    public Properties rowDie(String sql, String[] arr)
    {
        return null;
    }

    /**
     * Prepare and execute an SQL query and retrieve all the rows as an array
     *
     * While this might seem like a bad idea, the coding style for Tsugi is
     * to make every query a paged query with a limited number of records to
     * be retrieved to in most cases, it is quite reasonable to retrieve
     * 10-30 rows into an array.
     *
     * If code wants to stream the results of a query, they should do their
     * own query and loop through the rows in their own code.
     *
     * @param sql The SQL to execute in a string.  If the SQL is badly formed this function will die.
     * @param arr An optional array of the substitition values if needed by the query
     * @param error_log Indicates whether or not errors are to be logged. Default is TRUE.
     * @return List<Propertiesi> This is either the rows that was returned or null if no rows were returned.
     * If anything goes wrong the errors are logged and a runtime exception is thrown.
     */
    public List<Properties> allRowsDie(String sql, String[] arr)
    {
        return null;
    }
}
