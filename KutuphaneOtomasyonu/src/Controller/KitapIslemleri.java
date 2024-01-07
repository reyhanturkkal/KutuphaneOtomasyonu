package Controller;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
import Controller.EkranIslemStrategy;
import Model.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KitapIslemleri implements EkranIslemStrategy<Kitap>{

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public boolean girisYap(String username, String password){
        
        String sorgu = "Select * From Users where username = ? and password = ? ";
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
 
    }
    
    public ArrayList<Kitap> getirBilgi(){
        
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
    

    public KitapIslemleri() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı...");
        }

        try {
            Database db = Database.getSingletonDB(); 
            con = DriverManager.getConnection(db.DB_URL, db.USER, db.PASS);

        } catch (SQLException se) {
            System.out.println("Veritabanına bağlanırken bir hata oluştu.");
            se.printStackTrace();
        }
        
        System.out.println("Bağlantı Başarılı");
        
    }
    
    
    // Kitap Ekleme Kısmı
    public void kitapEkle(String name, String author, String page, String category_name){
        
        String sorgu = "Insert Into Books (name,author,page,category_name) VALUES (?,?,?,?) ";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, page);
            preparedStatement.setString(4, category_name);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Veritabanı bağlantısı ile güncellenecek alanı güncelleme
    public void kitapGuncelle(int book_id, String yeni_name, String yeni_author, String yeni_page, String yeni_category_name){
        
         String sorgu = "UPDATE Books SET name = ?, author = ?, page = ?, category_name = ? WHERE book_id = ?";
         
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_name);
            preparedStatement.setString(2, yeni_author);
            
            preparedStatement.setString(3, yeni_page);
            preparedStatement.setString(4, yeni_category_name);
 
            preparedStatement.setInt(5, book_id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void kitapSil(int book_id) {
        
        String sorgu = "Delete from Books where book_id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1,book_id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    
    public static void main(String[] args) {
        KitapIslemleri kitap = new KitapIslemleri();
    }
}
