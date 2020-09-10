package com.webber;

/**
 *
 * @author Nathaniel Webber
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book("Java I", "Nathaniel Webber");
        Book b2 = new Book("Java II", "Nathaniel Webber");
        Book b3 = new Book("Java II", "John Doe");
        Book b4 = new Book("Java II", "Nathaniel Webber");
        Book b5 = new ChildrensBook("Java II", "Nathaniel Webber", 
                "John Doe");
        
        System.out.println(b1.compareTo(b2)); 
        System.out.println(b2.compareTo(b3)); 
        System.out.println(b2.compareTo(b4));
        
        System.out.println(Book.totalBooks());
        System.out.println(b4);
        System.out.println(b5);
    }
    
}
