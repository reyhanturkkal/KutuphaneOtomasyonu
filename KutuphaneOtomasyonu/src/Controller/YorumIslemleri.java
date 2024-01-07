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
public class YorumIslemleri implements EkranIslemStrategy<Yorum>{
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public YorumIslemleri(){
     
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
    
public void yorumEkle(int review_id, String review_text, int rating, String bookName, String userName) {
    
    String sorgu = "Insert Into Reviews (review_id, review_text, rating, bookName, userName) VALUES (?,?,?,?,?) ";
    try {
        preparedStatement = con.prepareStatement(sorgu);
        
        preparedStatement.setInt(1, review_id);
        preparedStatement.setString(2, review_text);
        preparedStatement.setInt(3, rating);
        preparedStatement.setString(4, bookName);
        preparedStatement.setString(5, userName);
        
        preparedStatement.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(YorumIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    public ArrayList<Yorum> getirBilgi() {
    ArrayList<Yorum> cikti = new ArrayList<Yorum>();
        
        try { 
            statement = con.createStatement();
            String sorgu = "Select * From Reviews";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int review_id = rs.getInt("review_id");
                int book_id = rs.getInt("book_id");
                int user_id = rs.getInt("user_id");
                String review_text = rs.getString("review_text");
                int rating = rs.getInt("rating");
                String bookName = rs.getString("bookName");
                String userName = rs.getString("userName");
               
             
                
                cikti.add(new Yorum(review_id,book_id,user_id,review_text,rating,bookName,userName));
                
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}

   


    
}



