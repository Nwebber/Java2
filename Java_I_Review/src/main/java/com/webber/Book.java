package com.webber;

/**
 *
 * @author Nathaniel Webber
 */
public class Book implements Comparable<Book> {
    
    private String title;
    private String author;
    private static int num = 0;
    private int bookId;
    
    public Book(String t, String a) {
        
        setTitle(t);
        setAuthor(a);
        bookId = ++num;
    }
    
    public String getTitle() {
        
        return title;
    }
    
    public String getAuthor() {
        
        return author;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public void setAuthor(String a) {
        author = a;
    }
    
    public int compareTo(Book other) {
        if(this.author.compareTo(other.author) == 0){
            return this.title.compareTo(other.author);
        }
        return this.author.compareTo(other.author);
    }
    
    public static int totalBooks() {
        return num;
    }
    
    public String toString() {
        return String.format("%s was written by %s", 
        	title, author);
    }
}
