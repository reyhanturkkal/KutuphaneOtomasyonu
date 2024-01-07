package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pelinustunel
 */
public class Kitap {
    
    private int book_id;
    private String name;
    private String author;
    private int page;
    private String category_name;
    private int added_by_user;

    public Kitap(int book_id, String name, String author, int page, String category_name, int added_by_user) {
        this.book_id = book_id;
        this.name = name;
        this.author = author;
        this.page = page;
        this.category_name = category_name;
        this.added_by_user = added_by_user;
    }
    
    

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getAdded_by_user() {
        return added_by_user;
    }

    public void setAdded_by_user(int added_by_user) {
        this.added_by_user = added_by_user;
    }
    
    
    
}
