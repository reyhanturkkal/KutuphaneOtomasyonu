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
public class KullaniciIslemleri implements EkranIslemStrategy<Uyeler>{
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Uyeler> getirBilgi(){
        
        ArrayList<Uyeler> ciktilar = new ArrayList<Uyeler>();
        
        try { 
            statement = con.createStatement();
            String sorgu = "Select * From Users";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("user_id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String user_type = rs.getString("user_type");
                String telefon = rs.getString("telefon");
                String email = rs.getString("email");
                
               ciktilar.add(new Uyeler(id,username,password,user_type,telefon,email));
                
            }
            
            return ciktilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public KullaniciIslemleri() {
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
    
     
    // Veritabanı bağlantısı ile güncellenecek alanı güncelleme
    public void uyeGuncelle(int user_id, String yeni_username, String yeni_password, String yeni_telefon, String yeni_email){
        
         String sorgu = "UPDATE Users SET username = ?, password = ?, telefon = ?, email = ? WHERE user_id = ?";
         
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_username);
            preparedStatement.setString(2, yeni_password);
            
            preparedStatement.setString(3, yeni_telefon);
            preparedStatement.setString(4, yeni_email);
 
            preparedStatement.setInt(5, user_id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void uyeSil(int user_id) {
        
        String sorgu = "Delete from Users where user_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1,user_id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
    
}
