package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class Database {
    private static Database db;
     public static Database getSingletonDB() {
        if (db == null) {
            synchronized (Database.class) {
                if (db == null) {
                    db = new Database();
                }
            }
        }
        return db;
    }
     
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";//Buraya ellemenize gerek yok
    public static final String DOMAIN_NAME = "localhost";//Buraya ellemenize gerek yok
    public static final String DB_NAME = "lib_management"; // Buraya database'iniz ismi gelecek.
    public static final String DB_URL = "jdbc:mysql://" + DOMAIN_NAME + "/" + DB_NAME;//Buraya ellemenize gerek yok

    //  Database credentials
    public static final String USER = "root";//Buraya ellemenize gerek yok. Fakat MySQL connection'ın değerlerini değiştirdiyseniz, burayıda ona göre değiştirmelisiniz.
    public static final String PASS = "123456";//Buraya ellemenize gerek yok. Fakat MySQL connection'ın değerlerini değiştirdiyseniz, burayıda ona göre değiştirmelisiniz.
    
}


