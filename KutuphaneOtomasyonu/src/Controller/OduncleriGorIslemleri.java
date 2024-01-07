package Controller;

import Controller.EkranIslemStrategy;
import Model.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OduncleriGorIslemleri implements EkranIslemStrategy<Odunc>{
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public OduncleriGorIslemleri(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı...");
        }

        try {
            con = DriverManager.getConnection(Database.DB_URL, Database.USER, Database.PASS);

        } catch (SQLException se) {
            System.out.println("Veritabanına bağlanırken bir hata oluştu.");
            se.printStackTrace();
        }

        System.out.println("Bağlantı Başarılı");
    }

    @Override
    public ArrayList<Odunc> getirBilgi() {
    ArrayList<Odunc> cikti = new ArrayList<Odunc>();

    try {
        statement = con.createStatement();
    String sorgu = "SELECT Books.name AS bookname, Users.username AS username, Loans.loan_date, Loans.return_date " +
               "FROM Loans " +
               "JOIN Books ON Books.book_id = Loans.book_id " +
               "JOIN Users ON Users.user_id = Loans.user_id";

        ResultSet rs = statement.executeQuery(sorgu);

        while (rs.next()) {
            String bookName = rs.getString("bookname");
            String userName = rs.getString("username");
            String loanDate = rs.getString("loan_date");
            String returnDate = rs.getString("return_date");

            cikti.add(new Odunc(bookName, userName, loanDate, returnDate));
        }

        return cikti;

    } catch (SQLException ex) {
        Logger.getLogger(OduncleriGorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
}

}
