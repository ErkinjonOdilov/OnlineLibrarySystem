package library.data;


import library.service.BookType;

import javax.xml.transform.sax.SAXResult;

public class TakeBooks {
    private String firstName;
    private String lastName;
    private String bookName;
    private BookType bookType;
    private BookData bookInfo;

    public TakeBooks(String firstName, String lastName,String bookName, BookType bookType,BookData bookInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName=bookName;
        this.bookType = bookType;
        this.bookInfo=bookInfo;
    }

    public BookData getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookData bookInfo) {
        this.bookInfo = bookInfo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "TakeBooks{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookType=" + bookType +
                '}';
    }
}
