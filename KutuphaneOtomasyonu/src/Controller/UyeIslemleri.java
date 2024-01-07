package Controller;


import Model.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
public class UyeIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    public UyeIslemleri(){
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
    
    public void uyeEkleme(String username, String password, String user_type, String telefon, String email) {
        String sorgu = "INSERT INTO Users (username, password, user_type, telefon, email) VALUES (?, ?, ?, ?, ?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, user_type);
            preparedStatement.setString(4, telefon);
            preparedStatement.setString(5, email);

            preparedStatement.executeUpdate();
            System.out.println("Üye eklendi: " + username);
        } catch (SQLException ex) {
            System.out.println("Üye eklenirken bir hata oluştu:");
            ex.printStackTrace();
        } finally {
            // Gerekirse, burada preparedStatement ve diğer kaynakları kapatmayı unutmayın.
        }
    }
    
    
}
