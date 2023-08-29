package org.example;

public class Book {

    private String bookName;

    public void getBookName() {

        System.out.println("Book Name : " + bookName);
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void init(){
        System.out.println("init invoke");
    }
    public void destroy(){
        System.out.println("bean destroyed.");
    }
}
