/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory.DAO;

import com.inventory.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author deidine
 */
public class CaisseDAO {

    Connection conn = null;
    PreparedStatement prepStatement = null;
    PreparedStatement prepStatement2 = null;
    Statement statement = null;
    Statement statement2 = null;
    ResultSet resultSet = null;

    public CaisseDAO() {
        try {
            conn = new ConnectionFactory().getConn();
            statement = conn.createStatement();
            statement2 = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet getSalesInfo(String isloan) {
        try {

            String query = "SELECT `salesid`, `date`, `customercode`, `total_paye`, `recu`,"
                    + "`changeMony`, `soldby`, `productcode`, `quantity`,  `detaild`  FROM   salledata where isLoan='" + isloan + "' ";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
    public ResultSet getSalesTVAInfo(String isTva) {
        try {

            String query = "SELECT * FROM   salesinfo where isTva='" + isTva + "' ";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
public ResultSet getSalesDevisInfo(String isloan) {
        try {

            String query = "SELECT `salesid`, `date`, `customercode`, `total_paye`, `recu`,"
                    + "`changeMony`, `soldby`, `productcode`, `quantity`   FROM   devisdata where isLoan='" + isloan + "' ";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getCaisseInfo() {
        try {

            String query = "SELECT * FROM   caisse   ";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getCaisseLoanInfo() {
        try {

            String query = "SELECT * FROM   payloan ";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getLoansSearchInfo(String text) {
        try {

            String query = "SELECT `salesid`, `date`, `customercode`, `total_paye`, `recu`, "
                    + "`changeMony`, `soldby`, `productcode`, `quantity`,"
                    + "   `detaild` FROM loandata where "
                    + "productcode LIKE '%" + text + "%'   "
                    + " OR soldby  LIKE '%" + text + "%' OR customercode LIKE '%" + text
                    + "%' ORDER BY loansid";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getSalesSearchInfo(String text, String isLoan) {
        try {

            String query = "SELECT `salesid`, `date`, `customercode`, `total_paye`, `recu`, "
                    + "`changeMony`, `soldby`, `productcode`, `quantity`,"
                    + "   `detaild`  FROM "
                    + "salledata where "
                    + " customercode LIKE '%" + text + "%' and isLoan= '" + isLoan + "' ORDER BY salesid";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
    public ResultSet getSalesTVASearchInfo(String text, String isTva) {
        try {

            String query = "SELECT * FROM "
                    + "salesinfo where "
                    + " customercode LIKE '%" + text + "%' "
                    + "and isTva= '" + isTva + "' ORDER BY salesid";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
public ResultSet getSalesDevisSearchInfo(String text, String isLoan) {
        try {

            String query = "SELECT `salesid`, `date`, `customercode`, `total_paye`, `recu`, "
                    + "`changeMony`, `soldby`, `productcode`, `quantity`"
                    + "      FROM "
                    + "devisdata where "
                    + " customercode LIKE '%" + text + "%' and isLoan= '" + isLoan + "' ORDER BY salesid";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getCaisseSearchInfo(String text) {
        try {

            String query = "SELECT * FROM "
                    + "caisse where "
                    + " soldby LIKE '%" + text + "%'   ORDER BY salesid";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getCaisseLoanSearchInfo(String text) {
        try {

            String query = "SELECT * FROM "
                    + "payloan where "
                    + " soldby LIKE '%" + text + "%' or customercode  LIKE '%" + text + "%'   ORDER BY  id";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getDateOfSalesSearchInfo(String start, String end, String isLoan) {
        try {

            String query = "SELECT * FROM salledata where date BETWEEN '" + start + "' and '" + end + "' and isLoan= '" + isLoan + "'";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }public ResultSet getDateOfSalesTvaSearchInfo(String start, String end, String isTva) {
        try {

            String query = "SELECT * FROM salesinfo where date BETWEEN '" + start + "' and '" + end + "' and isTva= '" + isTva + "'";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
public ResultSet getDateOfSalesDevisSearchInfo(String start, String end, String isLoan) {
        try {

            String query = "SELECT * FROM devisdata where date BETWEEN '" + start + "' and '" + end + "' and isLoan= '" + isLoan + "'";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getDateOfCaisseSearchInfo(String start, String end) {
        try {

            String query = "SELECT * FROM caisse where date BETWEEN '" + start + "' and '" + end + "'";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getDateOfCaisseLoanSearchInfo(String start, String end) {
        try {

            String query = "SELECT * FROM payloan where date BETWEEN '" + start + "' and '" + end + "'";

            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

}
