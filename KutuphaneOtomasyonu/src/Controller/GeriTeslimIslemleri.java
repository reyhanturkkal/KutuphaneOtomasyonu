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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class GeriTeslimIslemleri implements EkranIslemStrategy<Odunc>{
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    public ArrayList<Odunc> getirBilgi() {
    ArrayList<Odunc> ciktilar = new ArrayList<Odunc>();

    try {
        statement = con.createStatement();
        String sorgu = "Select * From Loans";

        ResultSet rs = statement.executeQuery(sorgu);

        while (rs.next()) {
            int book_id = rs.getInt("book_id");
            int user_id = rs.getInt("user_id");
            String loan_date = rs.getString("loan_date");
            String return_date = rs.getString("return_date");

            ciktilar.add(new Odunc(book_id, user_id, loan_date, return_date));
        }

        return ciktilar;

    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
}
    public void oduncTeslimEt(int book_id) {
    try {
        // Loans tablosundan belirli book_id'ye sahip kayıtları sil
        String deleteQuery = "DELETE FROM Loans WHERE book_id = ?";
        preparedStatement = con.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, book_id);
        preparedStatement.executeUpdate();

        // Silinen kitapların bilgilerini Book tablosuna ekle
        String selectQuery = "SELECT * FROM Books WHERE book_id = ?";
        preparedStatement = con.prepareStatement(selectQuery);
        preparedStatement.setInt(1, book_id);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            String book_name = rs.getString("name");
            String author = rs.getString("author");
            int page = rs.getInt("page");
            String category_name = rs.getString("category_name");

            // Book tablosuna ekle
            String insertQuery = "INSERT INTO Books (name, author, page, category_name) VALUES (?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(insertQuery);
            preparedStatement.setString(1, book_name);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, page);
            preparedStatement.setString(4, category_name);
            preparedStatement.executeUpdate();
        }
    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    
    
    public GeriTeslimIslemleri(){
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
    
    
}
