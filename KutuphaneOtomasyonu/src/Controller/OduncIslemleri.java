package Controller;


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
public class OduncIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public OduncIslemleri(){
     
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
    
    // Kitapları getir metodu güncellendi
public ArrayList<Kitap> kitaplariGetirWithoutLoans() {
    ArrayList<Kitap> cikti = new ArrayList<Kitap>();
    
    try { 
        statement = con.createStatement();
        String sorgu = "SELECT * FROM Books " +
                       "LEFT JOIN Loans ON Books.book_id = Loans.book_id " +
                       "WHERE Loans.book_id IS NULL";
        
        ResultSet rs = statement.executeQuery(sorgu);
        
        while(rs.next()){
            int id = rs.getInt("book_id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            int page = rs.getInt("page");
            String category_name = rs.getString("category_name");
            int added_by_user = rs.getInt("added_by_user_id");

            cikti.add(new Kitap(id, name, author, page, category_name, added_by_user));
        }
        
        return cikti;
        
    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
}
    
    public ArrayList<Kitap> kitaplariGetir(){
        
        ArrayList<Kitap> cikti = new ArrayList<Kitap>();
        
        try { 
            statement = con.createStatement();
            String sorgu = "Select * From Books";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("book_id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                int page = rs.getInt("page");
                String category_name = rs.getString("category_name");
                int added_by_user = rs.getInt("added_by_user_id");
                
                cikti.add(new Kitap(id,name,author,page,category_name,added_by_user));
                
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
     // Kitap Ekleme Kısmı
    public void oduncEkle(int book_id, int user_id, String loan_date, String return_date) {
    String sorgu = "Insert Into Loans (book_id, user_id, loan_date, return_date) VALUES (?, ?, ?, ?)";
    try {
        preparedStatement = con.prepareStatement(sorgu);
        
        preparedStatement.setInt(1, book_id);
        preparedStatement.setInt(2, user_id);
        preparedStatement.setString(3, loan_date);
        preparedStatement.setString(4, return_date);
        
        preparedStatement.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(OduncIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public ArrayList<Uyeler> uyeleriGetir(){
        
        ArrayList<Uyeler> ciktilar = new ArrayList<Uyeler>();
        
        try { 
            statement = con.createStatement();
            String sorgu = "Select * From Users";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("user_id");
                String username = rs.getString("username");
                String user_type = rs.getString("user_type");
                
                
               ciktilar.add(new Uyeler(id,username,user_type));
                
            }
            
            return ciktilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(UyeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
