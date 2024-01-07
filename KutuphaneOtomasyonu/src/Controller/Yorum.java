package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class Yorum {

    private int review_id;
    private int book_id;
    private int user_id;
    private String review_text;
    private int rating;
    private String bookname;
    private String username;
    
    



    Yorum(int review_id, int book_id, int user_id, String review_text, int rating, String bookName, String userName) {
        this.review_id = review_id;
        this.book_id = book_id;
        this.user_id = user_id;
        this.review_text = review_text;
        this.rating = rating;
        this.bookname = bookName;
        this.username = userName;
    }
    
    
    
    /**
     * @return the review_id
     */
    public int getReview_id() {
        return review_id;
    }

    /**
     * @param review_id the review_id to set
     */
    public void setReview_id(int review_id) {
        this.review_id = review_id;
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
     * @return the review_text
     */
    public String getReview_text() {
        return review_text;
    }

    /**
     * @param review_text the review_text to set
     */
    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
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
