package com.webber;

/**
 *
 * @author Nathaniel Webber
 */
public class ChildrensBook extends Book{
    private String illustrator;
    
    public ChildrensBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }
    
    @Override
    public String toString() {
        return String.format("%s was written by %s and illustrated by %s", 
        	getTitle(), getAuthor(), illustrator);
    }
}
