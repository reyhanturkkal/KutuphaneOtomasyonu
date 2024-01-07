package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class Uyeler {
    
    private int user_id;
    private String username;
    private String password ;
    private String user_type;
    private String telefon;
    private String email;

    public Uyeler(int user_id, String username, String password, String user_type,String telefon, String email) {
        this.user_id = user_id;
        this.username = username;
        this.user_type = user_type;
        this.password = password;
        this.telefon = telefon;
        this.email = email;
    }
    

     public Uyeler(int user_id, String username,String user_type) {
        this.user_id = user_id;
        this.username = username;
        this.user_type = user_type;
        
    }
     

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     public String getUserType() {
        return user_type;
    }

    public void setUserType(String user_type) {
        this.user_type = user_type;
    }
    
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
