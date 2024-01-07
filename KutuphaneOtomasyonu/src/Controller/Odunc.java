package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class Odunc {

   
  
    private int book_id;
    private int user_id;
    private String loan_date;
    private String return_date;
    private String bookname;
    private String username;
    
    public Odunc(int book_id,int user_id,String loan_date,String return_date){
        this.book_id = book_id;
        this.loan_date = loan_date;
        this.return_date = return_date;
        this.user_id = user_id;
    }
       public Odunc( String bookname, String username, String loan_date, String return_date) {
        this.bookname = bookname;
        this.username = username;
        this.loan_date = loan_date;
        this.return_date = return_date;
    }
   
    /**
     * @return the book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the loan_date
     */
    public String getLoan_date() {
        return loan_date;
    }

    /**
     * @param loan_date the loan_date to set
     */
    public void setLoan_date(String loan_date) {
        this.loan_date = loan_date;
    }

    /**
     * @return the return_date
     */
    public String getReturn_date() {
        return return_date;
    }

    /**
     * @param return_date the return_date to set
     */
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
     /**
     * @return the bookname
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * @param bookname the bookname to set
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

      
    
}
